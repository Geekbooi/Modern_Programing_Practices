package Schoool_Lab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StaffStudents extends students{

    private double salary;
    private double GPA;
    private LocalDateTime dateTime;
    private List<Staff> courseList = new ArrayList<Staff>();


    public StaffStudents (String name, String phone, int age, double salary, double GPA, String phone, LocalDateTime dateTime){
        super(name,phone,age);
        this.salary = salary;
        this.GPA = GPA;
        this.dateTime=dateTime;
        this.courselist = new ArrayList<Staff>();
    }
    public String getStartDate() {
        return startDate;

        @override
    public double getSalary(){
        return salary;
    }
}
