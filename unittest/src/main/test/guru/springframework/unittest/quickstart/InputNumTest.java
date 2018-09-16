package guru.springframework.unittest.quickstart;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputNumTest {
InputNum array = new InputNum();
    @Test
    public void add() {
        int[] num = {1,3,42,2};
        String add = "48";
        String result = array.add(num);
        Assert.assertEquals(add,result);
    }
}