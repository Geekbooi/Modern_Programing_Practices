package school_lab;

import java.util.ArrayList;

public class Faculty extends person {
    private double salary;
    private List<course> courseList;
    public Faculty (String name, String phone, int age, double salary){
        Super(name,phone, age);
        thi.salary = salary;
        courseList = new ArrayList<course>();
    }
    public void addCourse(Course courses){
        courseList.add(courses);
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
    public void getTotalUnits(){
        double totalUnits = 0;
        if(courses !=null){
            for(Course C : courseList){
                totalUnits+=C.getUnits();
            }
        }
        else {
            System.out.println("There are no courses available to the Faculty");
        }
    }
    @override
    public double getSalary{

    }
}
