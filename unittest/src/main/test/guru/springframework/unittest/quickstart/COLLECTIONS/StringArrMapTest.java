package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringArrMapTest {
StringArrMap count = new StringArrMap();
    @Test
    public void countBool() {
        String[] patternString = {"a","b","c","d"};
        String[] example = {"a","b","c","d","a","c","c"};
        Map expected = new HashMap();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        Map actual = new HashMap();
        actual = count.CountBool(example,patternString);
        assertEquals(expected,actual);
    }
}