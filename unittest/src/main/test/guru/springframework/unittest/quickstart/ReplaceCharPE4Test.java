package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharPE4Test {
ReplaceCharPE4 reset = new ReplaceCharPE4();
    @Test
    public void result() {
        String query = "daily dry";
        String expected = "Output: faity fry";
        String actual = reset.result(query);
        assertEquals(expected,actual);
    }
}