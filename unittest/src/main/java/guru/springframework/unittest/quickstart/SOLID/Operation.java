package guru.springframework.unittest.quickstart.SOLID;

import org.junit.Test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Operation {

        Operation switchs = new Operation();
        private boolean command;

        public boolean getCommand(){
                return command;
        }
        public void setCommand(boolean command){
                this.command = command;
        }

        public Operation Switch(boolean command){

                if(command == true){
                        switchs.setCommand(command);
                }
                else{
                        switchs.setCommand(false);
                }
                return switchs;

        }
}