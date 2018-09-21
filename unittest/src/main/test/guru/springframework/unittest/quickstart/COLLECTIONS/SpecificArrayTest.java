package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.ArrayList;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class SpecificArrayTest {
SpecificArray arr = new SpecificArray();
    @Test
    public void firstElement() throws Exception {
        String remove = "Apple";
        String add = "Kiwi";
        ArrayList<String> example = new ArrayList<String>();
        example.add(remove);
        example.add("Grape");
        example.add("Melon");
        example.add("Berry");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add(add);
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");
/*
        ListIterator listIterator2 = expected.listIterator();
*/
        ArrayList<String> actual = arr.Array(example,add,remove);
        assertEquals(expected,actual);
        expected.clear();
        ArrayList<String> actualClear = arr.Arrays(example,add,remove);
        assertEquals(expected,actual);
    }
}