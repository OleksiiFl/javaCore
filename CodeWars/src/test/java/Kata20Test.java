import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata20Test {
    @Test
    void testWithoutSpaces(){
        assertEquals("camel Case", Kata20.camelCase("camelCase"));
    }
    @Test
    void testWithSpaces(){
        assertEquals(" camel Case ", Kata20.camelCase(" camelCase "));
    }

}