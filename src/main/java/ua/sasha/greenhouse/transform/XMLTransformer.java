package ua.sasha.greenhouse.transform;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.File;

public class XMLTransformer {

    public static void transform(String xml, String xslt, String output) throws Exception {
        Transformer t = TransformerFactory.newInstance()
                .newTransformer(new StreamSource(new File(xslt)));

        t.transform(new StreamSource(new File(xml)),
                    new StreamResult(new File(output)));
    }
}
