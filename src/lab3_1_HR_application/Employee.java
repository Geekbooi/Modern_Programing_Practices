package lab3_1_HR_application;

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
}
