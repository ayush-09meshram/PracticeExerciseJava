package guru.springframework.unittest.quickstart;

import java.util.*;
import java.*;
import java.util.Scanner;

public class Tom_Jerry{
    public String Input(int num){
        if(num>20 && num<30) {
            if (num % 2 == 0) {
                return "jerry";
            } else{
                return "tom";
            }
        }
        else{
            return null;
        }
    }
}