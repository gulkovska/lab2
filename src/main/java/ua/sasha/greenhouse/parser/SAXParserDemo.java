package ua.sasha.greenhouse.parser;

import ua.sasha.greenhouse.model.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserDemo extends DefaultHandler {

    private Flower flower = new Flower();
    private Plant currentPlant;
    private StringBuilder data = new StringBuilder();

    public Flower getFlower() { return flower; }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("Plant")) {
            currentPlant = new Plant();
            currentPlant.setId(attributes.getValue("id"));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        data.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("Name")) {
            currentPlant.setName(data.toString().trim());
        }
        if (qName.equals("Plant")) {
            flower.getPlants().add(currentPlant);
        }
        data.setLength(0);
    }
}
