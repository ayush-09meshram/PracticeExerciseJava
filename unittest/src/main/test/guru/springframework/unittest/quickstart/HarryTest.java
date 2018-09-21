package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class HarryTest {
Harry puttar = new Harry();
    @Test
    public void trueHarry() {
        String patternName = "Harry";
        String name = "Harry";
        String expected = "Is Harry here ? true";
        String actual = puttar.detect(name,patternName);
        assertEquals(expected,actual);
    }
    @Test
    public void falseHarry(){
        String patternName = "Harry";
        String name = "Henry";
        String expected = "Is Harry here ? false";
        String actual = puttar.detect(name,patternName);
        assertEquals(expected,actual);
    }
    @Test
    public void false2Harry(){
        String name = "John";
        String patternName = "Harry";
        String expected = "Is Harry here ? false";
        String actual = puttar.detect(name,patternName);
        assertEquals(expected,actual);
    }
    @Test
    public void false3Harry(){
        String name = "Behen****";
        String patternName = "Harry";
        String expected = "Is Harry here ? false";
        String actual = puttar.detect(name,patternName);
        assertEquals(expected,actual);
    }
}