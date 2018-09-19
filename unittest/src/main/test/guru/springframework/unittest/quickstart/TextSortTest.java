package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextSortTest {
TextSort sort = new TextSort();
    @Test
    public void text() {
        String query = "My name is Ayush and I'm kick ass";
        String[] actual = sort.text(query);
        String[] expected = {"Ayush", "I'm", "My", "and", "ass", "is", "kick", "name"};
        assertEquals(expected,actual);
    }
}