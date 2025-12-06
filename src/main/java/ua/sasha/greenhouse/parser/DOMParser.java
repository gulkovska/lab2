package ua.sasha.greenhouse.parser;

import ua.sasha.greenhouse.model.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class DOMParser {

    public Flower parse(String file) throws Exception {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new File(file));

        Flower flower = new Flower();
        NodeList list = doc.getElementsByTagName("Plant");

        for (int i = 0; i < list.getLength(); i++) {
            Element el = (Element) list.item(i);
            Plant p = new Plant();

            p.setId(el.getAttribute("id"));
            p.setName(el.getElementsByTagName("Name").item(0).getTextContent());
            p.setOrigin(el.getElementsByTagName("Origin").item(0).getTextContent());

            flower.getPlants().add(p);
        }
        return flower;
    }
}
