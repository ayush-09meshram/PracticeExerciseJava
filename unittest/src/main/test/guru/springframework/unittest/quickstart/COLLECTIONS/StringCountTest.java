package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
StringCount str = new StringCount();
    @Test
    public void count() {
        String[] pattern = {"one","two","three"};
        String example = "one one -one___two,,three,one @three*one?two";
        Map expected = new HashMap();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        Map actual = new HashMap();
        actual = str.Count(example, pattern);
        assertEquals(expected,actual);
    }
}