package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
Consecutive input = new Consecutive();
    @Test
    public void nonConsecutive() {
        int[] arr = {1,2,3,4,5,6,6};
        String expected = "[1, 2, 3, 4, 5, 6, 6] non consecutive numbers";
        String actual = input.number(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void consecutive(){
        int[] arr = {54,53,52,51,50,49,48};
        String expected = "[54, 53, 52, 51, 50, 49, 48] are consecutive numbers";
        String actual = input.number(arr);
        assertEquals(expected,actual);
    }
}