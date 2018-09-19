package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherPE4Test {
MatcherPE4 match = new MatcherPE4();
    @Test
    public void match() {
        String patternString = "se";
        String query = "She sells seashells by the seashore";
        String[] expected = {"Found at: 1 : 4 - 6" + "\n",
                "Found at: 2 : 10 - 12" + "\n" ,
                "Found at: 3 : 27 - 29" + "\n"};
        String[] actual = match.match(query,patternString);
        assertEquals(expected,actual);
    }
}