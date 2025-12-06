package ua.sasha.greenhouse;

import ua.sasha.greenhouse.model.Flower;
import ua.sasha.greenhouse.parser.DOMParser;
import ua.sasha.greenhouse.parser.SAXParserDemo;
import ua.sasha.greenhouse.parser.StAXParser;
import ua.sasha.greenhouse.transform.XMLTransformer;
import ua.sasha.greenhouse.util.PlantNameComparator;
import ua.sasha.greenhouse.util.XMLValidator;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("=== GREENHOUSE XML PROJECT DEMO ===\n");

        String xml = "src/main/resources/greenhouse.xml";
        String xsd = "src/main/resources/greenhouse.xsd";
        String xslt = "src/main/resources/flower.xslt";
        String htmlOut = "target/result.html";

        System.out.println("1) VALIDATION:");
        boolean valid = XMLValidator.validate(xml, xsd);
        System.out.println("   XML is valid: " + valid + "\n");

        System.out.println("2) DOM PARSER:");
        DOMParser domParser = new DOMParser();
        Flower domFlower = domParser.parse(xml);
        System.out.println("   DOM loaded plants: " + domFlower.getPlants().size());
        domFlower.getPlants().forEach(p -> System.out.println("   - " + p.getName()));
        System.out.println();

        System.out.println("3) SAX PARSER:");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        SAXParserDemo handler = new SAXParserDemo();
        saxParser.parse(new File(xml), handler);

        Flower saxFlower = handler.getFlower();
        System.out.println("   SAX loaded plants: " + saxFlower.getPlants().size());
        saxFlower.getPlants().forEach(p -> System.out.println("   - " + p.getName()));
        System.out.println();

        System.out.println("4) StAX PARSER:");
        StAXParser staxParser = new StAXParser();
        Flower staxFlower = staxParser.parse(xml);
        System.out.println("   StAX loaded plants: " + staxFlower.getPlants().size());
        staxFlower.getPlants().forEach(p -> System.out.println("   - " + p.getName()));
        System.out.println();

        System.out.println("5) SORTING:");
        Collections.sort(domFlower.getPlants(), new PlantNameComparator());
        System.out.println("   Sorted plants by name:");
        domFlower.getPlants().forEach(p -> System.out.println("   * " + p.getName()));
        System.out.println();

        System.out.println("6) XSLT TRANSFORMATION:");
        new File("target").mkdirs();
        XMLTransformer.transform(xml, xslt, htmlOut);

        System.out.println("   Transformation completed.");
        System.out.println("   Output HTML: " + htmlOut);

        System.out.println("\n=== END OF DEMO ===");
    }
}
