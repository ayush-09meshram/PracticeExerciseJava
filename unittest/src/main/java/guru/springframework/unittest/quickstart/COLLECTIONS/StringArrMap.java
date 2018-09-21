package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class StringArrMap {
    public Map CountBool(String[] example, String[] patternString) {
        Map countsBool = new HashMap();
        String examples = example.toString();
        boolean bool = true;
        for (int i = 0; i < patternString.length; i++) {
            int count = 0;
            for (int j = 0; j < example.length; j++) {
                Pattern pattern = Pattern.compile(patternString[i]);
                Matcher matcher = pattern.matcher(example[j]);
                while (matcher.find()) {
                    count++;
                    if (count >= 2) {
                        bool = true;
                    } else {
                        bool = false;
                    }
                }
                countsBool.put(patternString[i], bool);
            }
        }
        return countsBool;
    }
}