package guru.springframework.unittest.quickstart;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharInputTest {
CharInput input = new CharInput();
    @Test
    public void charIn() {
        char character = 'a';
        String ascii = "Small";
        String result = input.charIn(character);
        Assert.assertEquals(ascii,result);
    }
}