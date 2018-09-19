package guru.springframework.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTimeTest {
DateTime dates = new DateTime();
    @Test
    public void time() {
      String time = "";
      String answer = "  First Date of Week:             Mon 17/09/2018\n" +
              "\n" +
              "  Last date of the week:          Sun 23/09/2018";
      String output = dates.Display(time);
      assertEquals(answer,output);
    }
}