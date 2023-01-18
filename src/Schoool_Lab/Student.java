package Schoool_Lab;

import java.util.ArrayList;
import java.util.List;

public class Student extends person {
    private double GPA;

    private List<course> courseName = new ArrayList<course>();
    public Student(String name, String phone, int age, double gpa){
        super(name, phone, age);
        this.GPA = gpa;

    }
    public int gettotalUnits(){
        return
    }
}
