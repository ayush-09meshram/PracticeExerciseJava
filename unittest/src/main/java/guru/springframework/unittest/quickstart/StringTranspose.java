package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class StringTranspose {
    public String transpose(String queryString) {
        String[] temp = queryString.split("\\s+");
        String tempStr = temp.toString();
        String reverse = "";
        for (int i = 0; i < temp.length; i++) {
            for (int j =temp[i].length() - 1; j>=0; j--) {
                reverse = reverse + temp[i].charAt(j);
            }
            reverse = reverse + "  ";
        }
        return reverse;
    }
}