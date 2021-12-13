package com.example.xml_parsing_example;

import android.util.Log;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.SAXParserFactory;

public class SAXXMLParser {
    public static List<Employee> parse(InputStream in){
        List<Employee> employees = null;
        try{
            //create a XMLReader from SAXParser
            XMLReader xmlreader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();

            //create a SAXXMLHandler
            SAXXMLHandler saxxmlHandler = new SAXXMLHandler();

            //store handler in XMLReader
            xmlreader.setContentHandler(saxxmlHandler);

            //the process start
            xmlreader.parse(new InputSource(in));

            //
            employees = saxxmlHandler.getEmployees();
        }
        catch(Exception e){
            Log.d("XML","SaxxmlParser: parse() failed");
        }
        return employees;
    }

}
