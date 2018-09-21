package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class KeyValueReplaceTest {
KeyValueReplace maps = new KeyValueReplace();
    @Test
    public void findAndReplace1() {
        String key = "val1";
        String value = "java";
        Map input = new HashMap();
        input.put("val1","java");
        input.put("val2","c++");
        Map result = new HashMap();
        result.put("val1"," ");
        result.put("val2", "java");
        Map actual = new HashMap();
        actual = maps.FindAndReplace(input);
        assertEquals(result,actual);
    }
    @Test
    public void findAndReplace2() {
        String key = "val1";
        String value = "saturn";
        Map input = new HashMap();
        input.put("val1","saturn");
        input.put("val2","mars");
        Map result = new HashMap();
        result.put("val1"," ");
        result.put("val2", "saturn");
        Map actual = new HashMap();
        actual = maps.FindAndReplace(input);
        assertEquals(result,actual);
    }
}