package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class MatcherPE4{
    public String[] match(String name, String patternString){
        List<String> finale = new ArrayList<String>();
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(name);
        int count = 0;
        while(matcher.find()) {

            count++;
            finale.add("Found at: " + count + " : " + matcher.start() + " - " + matcher.end() + "\n");
            }
        String[] array = finale.toArray(new String[finale.size()]);
        return array;
        }

    }