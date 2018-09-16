package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Consonant_VowelTest {
    Consonant_Vowel checkIfConsonant_Vowel = new Consonant_Vowel();

    @Test
    public void word() {
        String word = "p";
        String test = "Consonant ";
        String result = checkIfConsonant_Vowel.word(word);
        Assert.assertEquals(test,result);
    }

    @Test
    public void vowel_consonant(){
        String word = "ap";
        String test = "Vowel Consonant ";
        String result = checkIfConsonant_Vowel.word(word);
        Assert.assertEquals(test,result);
    }

    @Test
    public void jumble(){
        String word = "stackroute";
        String test = "Consonant Consonant Vowel Consonant Consonant Consonant Vowel Vowel Consonant Vowel ";
        String result = checkIfConsonant_Vowel.word(word);
        Assert.assertEquals(test,result);
    }
}