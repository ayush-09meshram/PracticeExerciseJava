package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class StringCount {
    public Map Count(String example, String[] patternString) {
        Map counts = new HashMap();
        for (int i = 0; i < patternString.length; i++) {
                Pattern pattern = Pattern.compile(patternString[i]);
                Matcher matcher = pattern.matcher(example);
                int count = 0;
                while (matcher.find()) {
                    count++;
                    counts.put(patternString[i], count);
                }
        }
        return counts;
    }
}