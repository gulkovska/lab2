package ua.sasha.greenhouse.parser;

import ua.sasha.greenhouse.model.*;
import javax.xml.stream.*;
import java.io.*;

public class StAXParser {

    public Flower parse(String file) throws Exception {
        Flower flower = new Flower();
        Plant plant = null;

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader r = factory.createXMLStreamReader(new FileInputStream(file));

        while (r.hasNext()) {
            int type = r.next();

            if (type == XMLStreamReader.START_ELEMENT) {
                switch (r.getLocalName()) {
                    case "Plant":
                        plant = new Plant();
                        plant.setId(r.getAttributeValue(null, "id"));
                        break;
                    case "Name":
                        plant.setName(r.getElementText());
                        break;
                    case "Origin":
                        plant.setOrigin(r.getElementText());
                        break;
                }
            }

            if (type == XMLStreamReader.END_ELEMENT && r.getLocalName().equals("Plant")) {
                flower.getPlants().add(plant);
            }
        }
        return flower;
    }
}
