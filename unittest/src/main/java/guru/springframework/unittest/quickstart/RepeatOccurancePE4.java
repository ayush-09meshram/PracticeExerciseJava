package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class RepeatOccurancePE4{
    public int count(String queryString){
        String query = queryString.replaceAll("a","");
        int count = queryString.length() - query.length();
        return count;
    }
}