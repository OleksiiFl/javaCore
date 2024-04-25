import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata16Test {
    @Test
    public void arraysCompatingTestOne() {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(Kata16.comp(a, b));
    }
    @Test
    public void arraysCompNull() {
        int[] a = {};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertFalse(Kata16.comp(a, b));
    }
    @Test
    public void arraysCompNonEqualSizes() {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11, 2};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertFalse(Kata16.comp(a, b));
    }
    @Test
    public void arraysCompNegativeInt() {
        int[] a = {-121, 144, 19, -161, 19, 144, 19, -11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(Kata16.comp(a, b));
    }

}