package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class HarryTest {
Harry puttar = new Harry();
    @Test
    public void trueHarry() {
        String name = "Harry";
        String expected = "Is Harry here ? true";
        String actual = puttar.detect(name);
        assertEquals(expected,actual);
    }
    @Test
    public void falseHarry(){
        String name = "Henry";
        String expected = "Is Harry here ? false";
        String actual = puttar.detect(name);
        assertEquals(expected,actual);
    }
}