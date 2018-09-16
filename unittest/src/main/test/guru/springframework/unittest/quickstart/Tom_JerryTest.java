package guru.springframework.unittest.quickstart;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tom_JerryTest {
    @Test
    public void Tom() throws Exception{
        int num = 25;
        Tom_Jerry animal = new Tom_Jerry();
        String tom = animal.Input(num);
        Assert.assertEquals("tom",tom);
    }
    @Test
    public void Jerry() throws Exception{
        int num = 26;
        Tom_Jerry animal = new Tom_Jerry();
        String jerry = animal.Input(num);
        Assert.assertEquals("jerry",jerry);
    }

}