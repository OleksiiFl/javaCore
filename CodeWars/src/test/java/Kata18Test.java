import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata18Test {
    @Test
    public void testForPresentResultZero() {
        int[] a = {20,10,-80,10,10,15,35};
        assertEquals(0, Kata18.findEvenIndex(a));
    }
    @Test
    public void testForPresentResult() {
        int[] a = {1,2,3,4,3,2,1};
        assertEquals(3, Kata18.findEvenIndex(a));
    }
    @Test
    public void testForFirstOfIndexes() {
        int[] a = {10,5,-5,15};
        assertEquals(1, Kata18.findEvenIndex(a));
    }
    @Test
    public void testForAbsentEqualSum() {
        int[] a = {1,2,3,4,5};
        assertEquals(-1, Kata18.findEvenIndex(a));
    }
}