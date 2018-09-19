package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatOccurancePE4Test {
RepeatOccurancePE4 test = new RepeatOccurancePE4();
    @Test
    public void count() {
        String query = "Java is java again java again";
        int count = 10;
        int answer = test.count(query);
        assertEquals(count,answer);
    }
}