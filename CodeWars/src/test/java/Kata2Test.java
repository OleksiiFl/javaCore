import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata2Test {
    @Test
    void nameSinsertionTest() {
        String name = "Oleksii";
        String result = "Hello, " + name + " how are you doing today?";
        assertEquals("Hello, Oleksii how are you doing today?", result);
    }
}