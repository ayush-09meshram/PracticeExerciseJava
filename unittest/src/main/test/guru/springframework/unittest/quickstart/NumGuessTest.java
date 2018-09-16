package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumGuessTest {
NumGuess guessNum = new NumGuess();
    @Test
    public void guess1() {
        int num = 140;
        String answer = "Number guessed is less than original number";
        String result = guessNum.Guess(num);
        assertEquals(answer,result);
    }
    @Test
    public void guess2() {
        int num = 160;
        String answer = "Number guessed is more than original number";
        String result = guessNum.Guess(num);
        assertEquals(answer,result);
    }
    @Test
    public void guess3() {
        int num = 150;
        String answer = "Number guessed matches the original number";
        String result = guessNum.Guess(num);
        assertEquals(answer,result);
    }
}