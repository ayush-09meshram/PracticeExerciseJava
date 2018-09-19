package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class TextSort{
    public String[] text(String queryString){
        String[] query = queryString.split(" ");
        Arrays.sort(query);
        queryString = query.toString();
        return query;
    }
}