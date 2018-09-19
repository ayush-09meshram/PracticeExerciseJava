package guru.springframework.unittest.quickstart;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.util.List;

import static org.junit.Assert.*;

public class DateTime{
    public String Display(String time){
        List<String> Dates = new ArrayList<String>();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat dateForm = new SimpleDateFormat("EEE dd/MM/yyyy");
        Dates.add(dateForm.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        Dates.add(dateForm.format(c.getTime()));

        String realDates = Dates.toString();
        String first = "  First Date of Week: " + "            " + realDates.split(",")[0].split("\\[")[1] + "\n" + "\n";
        String last = "  Last date of the week: " + "        " + realDates.split(",")[1].split("]")[0];
        String answer = first + last;
        return answer;
    }
}