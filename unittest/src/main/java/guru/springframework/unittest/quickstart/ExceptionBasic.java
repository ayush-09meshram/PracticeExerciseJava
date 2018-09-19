package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;

import static org.junit.Assert.*;

public class ExceptionBasic{
    public String Exceptions(int n1, int n2, String argument, String interrupt){
        try{
            int division = n1/n2;
            System.out.print(division);
        } catch(Exception e){
            argument = "You cant do that";
        } finally {
            interrupt = "Meshram was hereeeeeeeeeee";
        }
    return argument + "\n" + "\n" + interrupt;
    }
}