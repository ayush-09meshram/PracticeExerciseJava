package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelNationTest {
VowelNation desh = new VowelNation();
    @Test
    public void input() {
        String[] input = new String[]{"India","UnitedStates"};
        String[] nation = new String[input.length];
        String expected = "[Ind, UntdStts]";
        String actual = desh.Input(nation,input);
        assertEquals(expected,actual);
    }
}