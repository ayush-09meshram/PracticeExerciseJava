package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
StringTranspose reverse = new StringTranspose();
    @Test
    public void transpose() {
        String query = "a quick brown fox jumps over the lazy dog";
        String expected = "a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god  ";
        String actual = reverse.transpose(query);
        assertEquals(expected,actual);
    }
}