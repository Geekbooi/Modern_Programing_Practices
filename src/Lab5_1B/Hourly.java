package Lab5_1B;

public class Hourly extends AEmployee {
    private int hourlyWage;
    private int hoursPerWeek;

    public Hourly(String empId, int hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return hoursPerWeek * hourlyWage * 4;
    }
}
