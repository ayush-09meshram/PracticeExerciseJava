package guru.springframework.unittest.quickstart;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class iterationTest {
iteration test = new iteration();
    @Test
    public void repeat() {
        int num = 3;
        String tree = "1 2 2 3 3 3 ";
        String output = test.repeat(num);
        Assert.assertEquals(tree,output);
    }
}