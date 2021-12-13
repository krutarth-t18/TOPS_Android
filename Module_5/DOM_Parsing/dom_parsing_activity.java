package com.example.xml_parsing_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static java.lang.System.in;

public class dom_parsing_activity extends AppCompatActivity {

    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dom_parsing_activity);
        linearLayout = findViewById(R.id.layout);

        try{
            InputStream stream = getAssets().open("file.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(stream);
            Element element = document.getDocumentElement();
            element.normalize();

            NodeList nodeList = document.getElementsByTagName("employee");
            for(int i=0;i<nodeList.getLength();i++) {
                TextView textView = new TextView(this);
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element1 = (Element)node;
                    textView.setTextSize(15);
                    textView.setTextColor(0xFFFF0000);
                    textView.setText(textView.getText()+"Name: "+ getValue("name",element1)+"\n");
                    textView.setText(textView.getText()+"Profession: "+getValue("profession",element1)+"\n");
                    linearLayout.addView(textView);

                }
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String getValue(String tag, Element e){
        NodeList node = e.getElementsByTagName(tag).item(0).getChildNodes();
        Node nodes = node.item(0);
        return nodes.getNodeValue();
    }
}