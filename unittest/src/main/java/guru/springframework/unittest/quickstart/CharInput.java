package guru.springframework.unittest.quickstart;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.*;
import java.*;
import java.util.Scanner;

public class CharInput{
    String answer = "";
    public String charIn(char character){
        if(character>='A' && character<='Z'){
            answer = "Capital";
        }
        else{
            answer = "Small";
        }
        return answer;
    }
}