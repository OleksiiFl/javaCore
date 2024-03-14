import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    void catNameTest(){
        Cat cat = new Cat("Ursa", 9);
        assertEquals("Ursa", cat.getName());
    }
    @Test
    void catAgeTest(){
        Cat cat = new Cat("Ursa", 9);
        assertEquals(9, cat.getAge());
    }
}
