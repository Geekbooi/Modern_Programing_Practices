package lab3_1_HR_application;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double salary;
    private List<Department> dept;

    public Company(String name){
        this.name = name;

        dept = new ArrayList<>();
    }
    public void print(){
        System.out.println("Name of the company is:" + this.name);
        for(Department D : dept) {
            D.Print();
        }
    }
    public void addDepartments(Department department) {
        dept.add(department);
    }
//    public double getSalary(){
//       double total=0;
//        for(Department D : dept){
//            total+=D.getSalary();
//        }
//        return salary;
//    }
    public void getSalary(){
        double total=0;
        for(Department D : dept) {
           total+= D.getSalary();
        }
        System.out.println("Total is " + total);
    }
}

