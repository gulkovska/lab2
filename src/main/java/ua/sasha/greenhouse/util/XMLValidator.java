package ua.sasha.greenhouse.util;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import java.io.File;

public class XMLValidator {

    public static boolean validate(String xml, String xsd) {
        try {
            SchemaFactory f = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema s = f.newSchema(new File(xsd));

            Validator v = s.newValidator();
            v.validate(new StreamSource(new File(xml)));

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
