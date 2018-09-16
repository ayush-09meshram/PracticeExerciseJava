package guru.springframework.unittest.quickstart;

import java.lang.reflect.Array;
import java.util.*;
import java.*;
import java.util.Scanner;

public class iteration{
    public String repeat(int num){
        //String number = Integer.toString(num);
        String answer = "";
        for(int i=1; i<=num;i++){
            for(int j=1; j<=i; j++){
                answer = answer + i + " ";
            }
        }
        return answer;
    }
}