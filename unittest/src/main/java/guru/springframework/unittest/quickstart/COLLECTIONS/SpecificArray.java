package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SpecificArray{
    public ArrayList<String> Array(ArrayList<String> Example, String add, String remove) throws Exception{
        Example.remove(remove);
        Example.add(0,add);
        return Example;
    }
    public ArrayList<String> Arrays(ArrayList<String> Example, String add, String remove){
        Example.remove(remove);
        Example.add(0,add);
        Example.clear();
        return Example;
    }
}