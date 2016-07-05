package com.company.model.parser;

import com.company.model.Gun;
import com.company.model.ObjectFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class performs parsing of XML document
 * using SAX parser.
 *
 * @version 05 Jule 2016
 * @author Yevhen Hryshchenko
 */
public class SaxParser extends DefaultHandler implements Parser{
    private String thisElement;
    private Gun.Weapon weapon;
    private ObjectFactory objectFactory = new ObjectFactory();
    List<Gun.Weapon> weapons = new ArrayList<>();

    @Override
    public List<Gun.Weapon> parse(String xmlPath){
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SaxParser saxp = new SaxParser();
            parser.parse(new File(xmlPath), saxp);
            return saxp.weapons;
        }catch (ParserConfigurationException | SAXException | IOException e){
            e.printStackTrace();
        }
        return weapons;
    }

    @Override
    public void startDocument(){
        System.out.println("Start parse XML...");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        thisElement = qName;
        if (thisElement.equals("weapon")){
            weapon = objectFactory.createGunWeapon();
            weapon.setId(attributes.getValue(0));
        }
        if (thisElement.equals("ttc")){
            weapon.setTtc(objectFactory.createGunWeaponTtc());
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        String data = new String(ch, start, length);
        switch (thisElement){
            case "model":
                weapon.setModel(data);
                break;
            case "handy":
                weapon.setHandy(data);
                break;
            case "origin":
                weapon.setOrigin(data);
                break;
            case "range":
                weapon.getTtc().setRange(data);
                break;
            case "effectiveRange":
                weapon.getTtc().setEffectiveRange(Integer.valueOf(data));
                break;
            case "holder":
                weapon.getTtc().setHolder(Boolean.valueOf(data));
                break;
            case "optics":
                weapon.getTtc().setOptics(Boolean.valueOf(data));
                break;
            case "material":
                weapon.setMaterial(data);
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        thisElement = "";
        if (qName.equals("weapon")){
            weapons.add(weapon);
        }
    }

    @Override
    public void endDocument(){
        System.out.println("Stop parse XML...");
    }
}
