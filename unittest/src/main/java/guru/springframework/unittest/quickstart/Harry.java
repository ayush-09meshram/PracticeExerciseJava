package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Harry{
    public String detect(String name){
        String result = "Is Harry here ? ";
        if(name.contains("Harry")){
            result = result + "true";
        }
        else{
            result = result + "false";
        }
        return result;

    }
}