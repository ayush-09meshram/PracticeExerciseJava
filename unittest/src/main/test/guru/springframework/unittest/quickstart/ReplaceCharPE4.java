package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ReplaceCharPE4{
    public String result(String queryString){
        String temp = queryString.replaceAll("d","f");
        String query = "Output: " +  temp.replaceAll("l","t");
        return query;
    }
}