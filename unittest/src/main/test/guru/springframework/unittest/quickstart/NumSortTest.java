package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumSortTest {
    NumSort sort = new NumSort();
    @Test
    public void sort() {
        int num = 422;
        String reverse = "Sorted number in non-increasing order : 422\n" +  "Sum of even numbers:6\n" + "False\n";
        String result = sort.Sort(num);
        assertEquals(reverse,result);
    }
}