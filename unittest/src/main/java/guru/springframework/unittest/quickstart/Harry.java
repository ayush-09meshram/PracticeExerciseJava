package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class Harry{
    public String detect(String name,String patternString){
        String result = "Is Harry here ? ";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(name);
        if(matcher.find()){
            result = result + "true";
        }
        else{
            result = result + "false";
        }
        return result;

    }
}