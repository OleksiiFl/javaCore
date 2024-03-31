import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    /*@Test
    void listTest() {
        char[] list = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i = 0; i < list.length; i++);
        assertEquals('e', list[4]);
    }*/

    @Test
    void stringAlphabetIndexTest() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length(); i++);
        assertEquals(6, alphabet.indexOf("g"));
    }
    @Test
    void stringAlphabetValueTest() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length(); i++);
        assertEquals('a', alphabet.charAt(0));
    }
    @Test
    void stringAlphabetASCIITest() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length(); i++);
        assertEquals(120, (int)alphabet.charAt(23));
    }
}