package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
StudentMarks input = new StudentMarks();
    @Test
    public void studMarks() {
        int numOfStudents = 6;
        int[] studGrades = {1,2,3,4,5,8};
        String answer = "";
        String result = input.StudMarks(numOfStudents,studGrades);
        assertEquals(answer,result);
    }

    @Test
    public void studMarksErr() {
        int numOfStudents = 6;
        int[] studGrades = {1,200,3,4,5,8};
        String answer = "Error";
        String result = input.StudMarks(numOfStudents,studGrades);
        assertEquals(answer,result);
    }
}