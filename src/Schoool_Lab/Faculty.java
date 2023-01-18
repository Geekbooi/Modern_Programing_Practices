package Schoool_Lab;

import java.util.ArrayList;

public class Faculty extends person {
    private double Salary;
    private List<course> courseList = new ArrayList<course>();
    public Faculty (double salary, double GPA, int age, String name, String phone, LocalDateTime dateTime){
        Super(name,phone, age);
    }



    public int getTotalUnits(){
        return courseList;
    }
    @override
    public double getSalary{

    }
}
