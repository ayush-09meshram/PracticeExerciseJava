package guru.springframework.unittest.quickstart;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.*;
import java.*;
import java.util.Scanner;

public class NumSort{
    public String Sort(int num){
             String number = Integer.toString(num);
             int numLength = number.length();
             int max = 0;
             int sumEven = 0;
             int[] numbers = new int[numLength];
             int[] sorted = new int[numLength];
             String sortedBoss = "";
            // int temp = num / 10;
             for(int i=0; i<numLength; i++) {
                 numbers[i] = num % 10;
                 num = num / 10;
                 for (int j = i+1; j < numLength; j++) {
                     sorted[j] = num % 10;
                     if (numbers[i] >= max) {
                             max = numbers[i];
                             numbers[i] = sorted[j];
                             sorted[j] = max;
                         }
                     sortedBoss = sortedBoss + numbers[i];
                 }
             }
             String sorteD = "Sorted number in non-increasing order : " + sortedBoss + "\n";
             for(int k=0; k<numLength; k++){
                 if(numbers[k]%2 == 0){
                     sumEven = sumEven + numbers[k];
                 }
             }
        String result = "Sum of even numbers:" + Integer.toString(sumEven) + "\n";
             String answer = "";
        if (sumEven < 15) {
            answer = "False\n";
        }
        else{
            answer = "True\n";
        }
             return sorteD + result + answer;
    }
}