package ua.sasha.greenhouse;

import org.junit.jupiter.api.Test;
import ua.sasha.greenhouse.util.XMLValidator;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationTest {

    @Test
    void testValidation() {
        assertTrue(XMLValidator.validate(
                "src/main/resources/greenhouse.xml",
                "src/main/resources/greenhouse.xsd"
        ));
    }
}
