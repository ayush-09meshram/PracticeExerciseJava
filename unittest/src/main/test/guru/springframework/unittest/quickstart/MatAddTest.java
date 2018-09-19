package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatAddTest {
MatAdd input = new MatAdd();
    @Test
    public void addMat() {
        int rowIndex = 3;
        int colIndex = 2;
        int[][] mat1 = {{1,2},{3,4},{5,6}};
        int[][] mat2 = {{9,8},{7,6},{5,4}};
        String answer = "[[10, 10], [10, 10], [10, 10]]";
        String check = input.AddMat(mat1,mat2,rowIndex,colIndex);
        assertEquals(answer,check);
    }
}