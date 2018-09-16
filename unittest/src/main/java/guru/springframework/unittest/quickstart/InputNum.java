package guru.springframework.unittest.quickstart;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.*;
import java.*;
import java.util.Scanner;

public class InputNum{
    public String add(int[] num){
        int addition = 0;
        int l = num.length;
        for(int i=0; i<l; i++){
            addition = addition + num[i];
        }
        String number = Integer.toString(addition);
        return number;
    }
}