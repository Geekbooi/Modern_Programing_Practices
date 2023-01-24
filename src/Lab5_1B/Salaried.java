package Lab5_1B;

public class Salaried extends AEmployee{
    private double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return salary;
    }

    public double getSalary() {
        return salary;
    }
}
