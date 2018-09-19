package guru.springframework.unittest.quickstart;

import java.util.*;
import java.*;
import java.util.Scanner;

public class PalindromePE2{
    public String reverse(int num){
        String number = Integer.toString(num);
        char[] reverseNum = number.toCharArray();
        for(int i=number.length()-1; i>=0; i--){
            int j = number.length() - i - 1;
            char reversed = number.charAt(i);
            reverseNum[j] = reversed;
        }
        int temp = Integer.parseInt(new String(reverseNum));
        number = Integer.toString(temp);
        return number;
    }
}