import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    Cat cat;
    @BeforeEach
    void addCat() {
        cat = new Cat("Ursa", "female", "grey", 9);
    }
    @Test
    void catGetNameTest(){
        assertEquals("Ursa", cat.getName());
    }
    @Test
    void catSetNameTest() {
        cat.setName("Bars");
        assertEquals("Bars", cat.getName());
    }
    @Test
    void catGetAgeTest(){
        assertEquals(9, cat.getAge());
    }
    @Test
    void catSetAgeTest() {
        cat.setAge(10);
        assertEquals(10, cat.getAge());
    }
    @Test
    void catGetColorTest() {
        assertEquals("grey", cat.getColor());
    }
}
