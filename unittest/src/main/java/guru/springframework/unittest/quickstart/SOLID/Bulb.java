package guru.springframework.unittest.quickstart.SOLID;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Bulb extends guru.springframework.unittest.quickstart.SOLID.Operation {

    Bulb bulb = new Bulb();
    boolean command = switchs.getCommand();

    public boolean Bulb(boolean on) {
        return command;
    }
}