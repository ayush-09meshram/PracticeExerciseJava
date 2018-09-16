package guru.springframework.unittest.quickstart;

import java.util.*;
import java.*;
import java.util.Scanner;

        public class palindrome{
                public String Array(int num){
                        int sum=0;
                        int reversedInteger = 0;
                        if(num!=0){
                                String number = Integer.toString(num);
                                int[] numbers = new int[number.length()];
                                for(int i=0; i<number.length(); i++) {
                                        numbers[i] = num%10;
                                        reversedInteger = reversedInteger*10 + numbers[i];
                                        num=num/10;
                                }
                                for(int j=0; j<number.length(); j++) {
                                        if (num == reversedInteger) {
                                                if (numbers[j] % 2 == 0){
                                                        sum = sum + numbers[j];
                                                }
                                                if(sum>25){
                                                        return num + "is a palindrome and sum of even numbers is greater than 25";
                                                }
                                                else{
                                                        return num + "is a palindrome and sum of even numbers is lesser than 25";
                                                }
                                        }
                                        else{
                                                return num + "is not palindrome";
                                        }
                                }
                        }
                        else{
                                return null;
                        }
                        return null;
                }

        }