package com.company.model.parser;

import com.company.model.Gun;
import com.company.model.ObjectFactory;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * This class performs parsing of XML document
 * using StAX parser.
 *
 * @version 05 Jule 2016
 * @author Yevhen Hryshchenko
 */

public class StaxParser implements Parser {
    private Gun.Weapon weapon;
    private ObjectFactory objectFactory = new ObjectFactory();
    private List<Gun.Weapon> weapons = new ArrayList<>();

    @Override
    public List<Gun.Weapon> parse(String xmlPath) {
        String tagContent = "";

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(xmlPath));

            while (reader.hasNext()) {
                int event = reader.next();

                if (event == XMLStreamConstants.START_ELEMENT) {
                    if (reader.getLocalName().equals("weapon")) {
                        weapon = objectFactory.createGunWeapon();
                        weapon.setId(reader.getAttributeValue(0));
                    }
                    if (reader.getLocalName().equals("ttc")) {
                        weapon.setTtc(objectFactory.createGunWeaponTtc());
                    }
                }
                if (event == XMLStreamConstants.CHARACTERS) {
                    tagContent = reader.getText().trim();
                }
                if (event == XMLStreamConstants.END_ELEMENT) {
                    switch (reader.getLocalName()) {
                        case "weapon":
                            weapons.add(weapon);
                            break;
                        case "model":
                            weapon.setModel(tagContent);
                            break;
                        case "handy":
                            weapon.setHandy(tagContent);
                            break;
                        case "origin":
                            weapon.setOrigin(tagContent);
                            break;
                        case "range":
                            weapon.getTtc().setRange(tagContent);
                            break;
                        case "effectiveRange":
                            weapon.getTtc().setEffectiveRange(Integer.valueOf(tagContent));
                            break;
                        case "holder":
                            weapon.getTtc().setHolder(Boolean.valueOf(tagContent));
                            break;
                        case "optics":
                            weapon.getTtc().setOptics(Boolean.valueOf(tagContent));
                            break;
                        case "material":
                            weapon.setMaterial(tagContent);
                            break;
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return weapons;
    }
}
