package guru.springframework.unittest.quickstart.SOLID;

import org.junit.Test;

import static org.junit.Assert.*;

public class BulbTest {
Bulb input = new Bulb();
    @Test
    public void On() {
        boolean on = true;
        boolean expected = true;
        boolean actual = input.Bulb(on);
        assertEquals(expected,actual);
    }

    @Test
    public void Off()

    {
        boolean on = false;
        boolean expected = false;
        boolean actual = input.Bulb(on);
        assertEquals(expected,actual);
    }
}