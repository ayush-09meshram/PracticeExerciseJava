package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
ChessBoard block = new ChessBoard();
    @Test
    public void space() {
        int size = 8;
        String output = "My Chess Board\n" +
                "\n" +
                "      WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "\n" +
                "      BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "\n" +
                "      WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "\n" +
                "      BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "\n" +
                "      WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "\n" +
                "      BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "\n" +
                "      WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "\n" +
                "      BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "\n";
        String answer = block.Space(size);
        assertEquals(output,answer);
    }
}