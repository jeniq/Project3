package com.company.model.parser;

import com.company.model.Gun;
import com.company.model.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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
public class DomParser implements Parser {
    private List<Gun.Weapon> weapons = new ArrayList<>();
    private Gun.Weapon weapon;
    private ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public List<Gun.Weapon> parse(String xmlPath) {
        try{
            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File(xmlPath));
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("weapon");
            for (int i = 0; i < nodeList.getLength(); i++){
                weapon = objectFactory.createGunWeapon();
                Node node = nodeList.item(i);
                weapon.setId(String.valueOf(node.getAttributes().item(0).getTextContent()));

                Element element = (Element) node;
                weapon.setModel(element.getElementsByTagName("model").item(0).getTextContent());
                weapon.setHandy(element.getElementsByTagName("handy").item(0).getTextContent());
                weapon.setOrigin(element.getElementsByTagName("origin").item(0).getTextContent());
                weapon.setMaterial(element.getElementsByTagName("material").item(0).getTextContent());

                Element ttc = (Element) node.getChildNodes();
                weapon.setTtc(objectFactory.createGunWeaponTtc());
                weapon.getTtc().setRange(ttc.getElementsByTagName("range").item(0).getTextContent());
                weapon.getTtc().setEffectiveRange(
                        Integer.valueOf(ttc.getElementsByTagName("effectiveRange").item(0).getTextContent()));
                weapon.getTtc().setHolder(
                        Boolean.valueOf(ttc.getElementsByTagName("holder").item(0).getTextContent()));
                weapon.getTtc().setOptics(
                        Boolean.valueOf(ttc.getElementsByTagName("optics").item(0).getTextContent()));

                weapons.add(weapon);
            }
        }catch (ParserConfigurationException | SAXException | IOException e){
            e.printStackTrace();
        }
        return weapons;
    }
}
