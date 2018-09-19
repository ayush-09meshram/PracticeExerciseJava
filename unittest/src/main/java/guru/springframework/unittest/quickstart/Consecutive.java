package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;

import static org.junit.Assert.*;

public class Consecutive{
    public String number(int[] arr){
        String result = "";
            for(int i=0; i<arr.length; i++){
                if(i+1<arr.length) {
                    if (arr[i]== arr[i + 1] + 1) {
                        result = Arrays.toString(arr) + " are consecutive numbers";
                    }
                    else{
                        result = Arrays.toString(arr) + " non consecutive numbers";
                    }
                }
            }
            return result;
    }
}