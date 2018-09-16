package guru.springframework.unittest.quickstart;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {

    @Test
    public void number() throws Exception{
        int num = 54345;
        palindrome reverse = new palindrome();
        String palindroma = reverse.Array(num);
        Assert.assertEquals(palindroma, 12345);
    }
    @Test
    public void evenSum() throws Exception{
        int sum = 88888;
        palindrome sumGreater = new palindrome();
        String palindromaa = sumGreater.Array(sum);
        Assert.assertEquals(palindromaa, 88888 + "is a palindrome and sum of even numbers is greater than 25");
    }
    @Test
    public void evenLess() throws Exception{
        int sum = 54345;
        palindrome sumGreater = new palindrome();
        String palindromaa = sumGreater.Array(sum);
        Assert.assertEquals(palindromaa, 12345 + "is a palindrome and sum of even numbers is lesser than 25");
    }

}