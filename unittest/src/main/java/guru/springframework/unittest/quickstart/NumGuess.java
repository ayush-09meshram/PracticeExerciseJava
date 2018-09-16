package guru.springframework.unittest.quickstart;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.*;
import java.*;
import java.util.Scanner;

public class NumGuess{
    public String Guess(int num){
        String result = "";

            if (num > 150) {
                result = "Number guessed is more than original number";
            }
            if (num < 150) {
                result = "Number guessed is less than original number";
            }
            if (num == 150) {
                result = "Number guessed matches the original number";
            }

        return result;
    }
}