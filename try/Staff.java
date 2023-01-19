package school_lab;

public class Staff extends person{
    private double Salary;
    public Staff(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

}
