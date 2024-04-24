import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Kata14Test {
    @Test
    public void fixedTest() {
        assertTrue(Kata14.feast("great blue heron","garlic nann"));
        assertTrue(Kata14.feast("chickadee","chocolate cake"));
        assertFalse(Kata14.feast("brown bear","wolf claw"));
    }

}