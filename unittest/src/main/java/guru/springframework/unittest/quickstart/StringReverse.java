package guru.springframework.unittest.quickstart;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.*;
import java.*;
import java.util.Scanner;

public class StringReverse{
    public String Reverse(String input){
        String temp = "";
       for(int i=input.length()-1; i>=0; i--){
           temp= temp + input.charAt(i);
       }
       String output = temp.trim();
       return output;
    }
}