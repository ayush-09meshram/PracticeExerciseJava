/*Set<String> hash_Set = new HashSet<String>(); */

package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SetHaiBoss{
    public ArrayList Arrange(Set input){
        ArrayList sortedList = new ArrayList(input);
        Collections.sort(sortedList);
        return sortedList;
    }
}
