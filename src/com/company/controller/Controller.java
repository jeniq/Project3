package com.company.controller;

import com.company.model.Gun;
import com.company.model.parser.DomParser;
import com.company.model.parser.SaxParser;
import com.company.model.parser.StaxParser;
import com.company.view.View;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * This class validates XML documents,
 * executes parsing them and prints result
 * to console.
 *
 * @version 05 Jule 2016
 * @author Yevhen Hryshchenko
 */
public class Controller {
    private View view;
    private SaxParser saxParser;
    private StaxParser staxParser;
    private DomParser domParser;

    public Controller(View view){
        this.view = view;
    }

    // The work method
    public void processUser(){
        List<Gun.Weapon> weapons;
        if (validate(Initialization.XML_PATH, Initialization.XSD_PATH)){

            // SAX parser
            view.print(View.SAX_PARSER);
            saxParser = new SaxParser();
            weapons = saxParser.parse(Initialization.XML_PATH);
            view.print(weapons);

            // StAX parser
            view.print(View.STAX_PARSER);
            staxParser = new StaxParser();
            weapons = staxParser.parse(Initialization.XML_PATH);
            view.print(weapons);

            // DOM parses
            view.print(View.DOM_PARSER);
            domParser = new DomParser();
            weapons = domParser.parse(Initialization.XML_PATH);
            view.print(weapons);
        }else{
            view.print(View.INVALID_DOCUMENT);
        }
    }

    /**
     *
     * @param xmlPath
     * @param xsdPath
     * @return
     */
    public boolean validate(String xmlPath, String xsdPath){
        try{
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (SAXException | IOException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
