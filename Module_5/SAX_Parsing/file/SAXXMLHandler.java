package com.example.xml_parsing_example;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXXMLHandler extends DefaultHandler {
    private List<Employee> employees;
    private String tempVal;
    private Employee tempemployee;

    public SAXXMLHandler(){
        employees = new ArrayList<Employee>();
    }
    public List<Employee> getEmployees(){
        return employees;
    }

    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

        tempVal = ""; //reset
        if(qName.equalsIgnoreCase("employee")){
            tempemployee = new Employee();
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException{
        tempVal = new String(ch,start,length);
    }

    public void endElement(String uri, String localName, String qName) throws SAXException{
        if (qName.equalsIgnoreCase("employee")) {
            // add it to the list
            employees.add(tempemployee);
        }
        else if (qName.equalsIgnoreCase("id")) {
            tempemployee.setId(Integer.parseInt(tempVal));
        }
        else if (qName.equalsIgnoreCase("name")) {
            tempemployee.setName(tempVal);
        }
        else if (qName.equalsIgnoreCase("department")) {
            tempemployee.setDepartment(tempVal);
        }
        else if (qName.equalsIgnoreCase("type")) {
            tempemployee.setType(tempVal);
        }
        else if (qName.equalsIgnoreCase("email")) {
            tempemployee.setEmail(tempVal);
        }

    }
}
