import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {
    @Test
    void inputStringInReverseTest() {
        String input = "Challange";
        String result = "";
        for(int i = 1; i <= input.length(); i++) {
            result += input.charAt(input.length() - i);
        }
        assertEquals("egnallahC", result);
    }


}