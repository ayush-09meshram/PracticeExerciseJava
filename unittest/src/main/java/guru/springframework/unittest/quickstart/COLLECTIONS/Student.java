package guru.springframework.unittest.quickstart.COLLECTIONS;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Student{
    private String id;
    private int age;
    private String name;

    public Student(String name,int age,String id) {
        this.name = name;
        this.age = age;
        this.id =  id;
    }

    public String getName() { return this.name; }
    public String getId() { return this.id; }
    public int getAge() { return this.age; }

    public void setName(String name) { this.name = name;}
    public void setAge(int age) { this.age = age; }
    public void setId(String id) { this.id = id; }
}