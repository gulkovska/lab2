package ua.sasha.greenhouse;

import org.junit.jupiter.api.Test;
import ua.sasha.greenhouse.model.Flower;
import ua.sasha.greenhouse.parser.DOMParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {

    @Test
    void testDOM() throws Exception {
        DOMParser p = new DOMParser();
        Flower f = p.parse("src/main/resources/greenhouse.xml");
        assertEquals(2, f.getPlants().size());
    }
}
