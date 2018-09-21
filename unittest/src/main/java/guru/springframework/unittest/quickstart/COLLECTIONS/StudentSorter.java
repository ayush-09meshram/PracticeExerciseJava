package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()!=o2.getAge()) {
            return o1.getAge()-o2.getAge();
        }
        else {
            if(o1.getName()!=o2.getName()) {
                return o1.getName().compareTo(o2.getName());
            }
            else return o1.getId().compareTo(o2.getId());
        }
    }
}