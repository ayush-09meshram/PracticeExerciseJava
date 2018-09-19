package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;

import static org.junit.Assert.*;

public class ThreeExceptions{
    public String Exceptional(String surprise, int i,int n, String IOB, String NAS, String numb){
        try{
            int array = Integer.parseInt(surprise); //For null pointer
            //int[] arr = new int[]{array}; //For index out of bounds
            int[]arr = new int[array]; //For negative array size
             for(i = 0; i<n; i++){
                 arr[i] = 0;
             }
         }
        catch(NullPointerException e){
            numb = "You're null";
        }
         catch(IndexOutOfBoundsException e){
             IOB = "Don't exceed your limits";
         }
         catch (NegativeArraySizeException e){
             NAS = "Don't go so low";
         }

         return IOB + "\n" + NAS + "\n" + numb + "\n";
    }
}