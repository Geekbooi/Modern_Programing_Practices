package lab3_1_HR_application;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String title;
    private String description;
    private Employee employees;

    public Position(String title, String description){
        this.title=title;
        this.description=description;
    }
    public void print(){
        System.out.println("Position is " + this.title);
        if(employees!=null)
        employees.print();
    }
    public String getTitle(){
        return title;
    }

    public void addEmployee(Employee e){
        employees=e;
    }
    public double getSalary(){
        if(employees!=null){
           return employees.getSalary();
        }
        return 0;

    }
}
