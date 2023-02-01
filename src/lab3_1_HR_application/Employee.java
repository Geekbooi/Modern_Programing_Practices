package lab3_1_HR_application;

import java.util.Objects;

public class Employee {
    private String employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private int birthDate;
    private int SSN;
    private double salary;

    Position positions;

    public Employee(String employeeId, String firstName, String middleInitial, String lastName, int birthDate, double salary){
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.middleInitial=middleInitial;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.SSN=SSN;
        this.salary=salary;
    }


    public void print(){
        System.out.println("first name is " + this.firstName);
    }
    public double getSalary(){
        return salary;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Employee emp = null;
        if (obj instanceof Employee) {
            emp = (Employee) obj;
        }
        return (this.firstName.equals(emp.firstName) && this.middleInitial.equals(emp.middleInitial) &&
                this.lastName.equals(emp.lastName) && this.salary == (emp.salary) &&
                this.employeeId.equals(emp.employeeId) && this.birthDate == (emp.birthDate));
    }

}
