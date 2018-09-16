package guru.springframework.unittest.quickstart;

import java.lang.reflect.Array;
import java.util.*;
import java.*;
import java.util.Scanner;

public class Consonant_Vowel {
    public String word(String chararacter) {
        //String[] check = new String[]{chararacter};
        char[] check = chararacter.toCharArray();
        String amount = "";
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 'a' || check[i] == 'e' || check[i] == 'i' || check[i] == 'o' || check[i] == 'u' || check[i] == 'A' || check[i] == 'E' || check[i] == 'I' || check[i] == 'O' || check[i] == 'U') {
                amount = amount + "Vowel" +" ";
            } else {
                amount = amount + "Consonant" + " ";
            }
        }
        return amount;
    }

}