package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ChessBoard{
    public String Space(int size) {
        String[][] board = new String[size][size];
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    if(i%2 == 0){
                     if(j%2 == 0){
                         board[i][j] = "WW|";
                     }
                     else {
                         board[i][j] = "BB|";
                     }
                    }
                    else{
                        if(j%2==0){
                            board[i][j] = "BB|";
                        }
                        else{
                            board[i][j] = "WW|";
                        }
                    }
                    if(j%8==0){
                        board[i][j] = board[i][j] + "\n" + "\n";
                    }
                }
            }
        String answer = "My Chess Board" + "\n" + "\n" + Arrays.deepToString(board);
        return answer;
    }

}