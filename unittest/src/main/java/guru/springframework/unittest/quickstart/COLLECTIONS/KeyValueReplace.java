package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class KeyValueReplace{
    public Map FindAndReplace(Map input, String key, String value){
        Iterator<Map.Entry<String, String>> iterate = input.entrySet().iterator();
        while(iterate.hasNext()){
            Map.Entry<String, String> iterator = iterate.next();
            key = iterator.getKey();
            input.put(key,value);
            iterator = iterate.next();
            key = iterator.getKey();
            input.put(key, " ");

        }
        return input;
      /* Object replace = input.get(key);
       input.put(key, " ");*/
    }
}