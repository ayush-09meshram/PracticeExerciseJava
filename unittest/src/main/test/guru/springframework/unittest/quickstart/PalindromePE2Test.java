package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePE2Test {
PalindromePE2 checkIf = new PalindromePE2();
    @Test
    public void reverse() {
        int num = 89798;
        String answer = "89798";
        String check = checkIf.reverse(num);
        assertEquals(answer,check);
    }
}