package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
StringReverse inputString = new StringReverse();
    @Test
    public void reverse() {
        String input = "london";
        String answer = "nodnol";
        String output = inputString.Reverse(input);
        assertEquals(answer,output);
    }
}