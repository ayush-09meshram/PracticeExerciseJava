package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetHaiBossTest {
SetHaiBoss input = new SetHaiBoss();
    @Test
    public void arrange() {
        ArrayList<String> out = new ArrayList<String>();
        out.add(0,"Alice");
        out.add(1,"Bluto");
        out.add(2,"Eugene");
        out.add(3,"Harry");
        out.add(4,"Olive");
        Set inputs = new TreeSet();
        inputs.add("Alice");
        inputs.add("Eugene");
        inputs.add("Bluto");
        inputs.add("Harry");
        inputs.add("Olive");
        ArrayList<String> result = new ArrayList<String>();
        result = input.Arrange(inputs);
        assertEquals(out,result);

    }
}