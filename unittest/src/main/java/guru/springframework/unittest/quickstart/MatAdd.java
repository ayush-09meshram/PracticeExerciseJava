package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MatAdd{
    public String AddMat(int mat1[][], int mat2[][],int rowIndex, int colIndex){
        int matFinal[][] = new int[rowIndex][colIndex];
        for(int i=0; i<rowIndex; i++){
            for(int j=0; j<colIndex; j++){
                matFinal[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        String answer = Arrays.deepToString(matFinal);
        return answer;
    }
}