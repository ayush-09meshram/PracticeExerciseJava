package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeExceptionsTest {
ThreeExceptions input = new ThreeExceptions();
    @Test
    public void outOfBounds() {
        String numb = "";
        String IOB = "";
        String NAS = "";
        String surprise = "98273";
        int i = 0;
        int n = 9;
        String expected = "Don't exceed your limits\n" +
                "\n" +
                "\n";
        String answer = input.Exceptional(surprise,i,n,IOB,NAS,numb);
        assertEquals(expected,answer);
    }
    @Test
   public void nullPointer() {
        String numb = "";
        String IOB = "";
        String NAS = "";
        String surprise = null;
        int i = 0;
        int n=3;
        String expected = "";
        String answer = input.Exceptional(surprise,i,n,IOB,NAS,numb);
        assertEquals(expected,answer);
    }

    @Test
    public void negativeSize() {
        String numb = "";
        String IOB = "";
        String NAS = "";
        String surprise = "-4";
        int i=-9;
        int n = 9;
        String expected = "\n" +
                "Don't go so low\n" +
                "\n";
        String answer = input.Exceptional(surprise,i,n,IOB,NAS,numb);
        assertEquals(expected,answer);
    }
}