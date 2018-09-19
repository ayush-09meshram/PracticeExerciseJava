package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class VowelNation{
    public String Input(String[] nation, String[] input){
       for(int i=0; i<nation.length; i++){
           nation[i] = input[i];
           nation[i] = nation[i].replaceAll("a|e|i|o|u", "");
       }
       String nations = Arrays.deepToString(nation);
       return nations;
    }
}