package guru.springframework.unittest.quickstart;

import org.junit.Test;
import java.util.Scanner;

import static org.junit.Assert.*;

public class StudentMarks{
    public String StudMarks(int numOfStudents, int[] studGrades){
        Scanner scan = new Scanner(System.in);
        String answer = "";
        for(int i=0; i<numOfStudents; i++){
            if(studGrades[i]>0 && studGrades[i]<100){
                continue;
            }
            else{
                answer = "Error";
                break;
            }
        }
      return answer;
    }
}