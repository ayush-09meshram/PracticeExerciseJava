package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionBasicTest {
ExceptionBasic input = new ExceptionBasic();
    @Test
    public void exceptions() {
        int n1 = 5;
        int n2 = 0;
        String argument = "";
        String interrupt = "";
        String expected = "You cant do that\n" + "\n" +
                "Meshram was hereeeeeeeeeee";
        String result = input.Exceptions(n1,n2,argument,interrupt);
        assertEquals(expected,result);
    }
}