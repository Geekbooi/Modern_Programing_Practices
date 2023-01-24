package Lab5_1B;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;


public abstract class AEmployee {
    private final UUID empId;
    private final List<PayCheck> payCheckList;

    public AEmployee(String empId) {
        this.empId = UUID.randomUUID();
        payCheckList = new ArrayList<>();
    }

    public void print(){
        for(PayCheck p : payCheckList)
            p.print();

    }
    public void addPaycheck(PayCheck payCheck){
        payCheckList.add(payCheck);
    }
    public PayCheck calcCompensation(int month, int year) {
        LocalDateTime start = LocalDateTime.of(year, month, 1, 0, 0);
        DateRange payPeriod = new DateRange(start, start.plusMonths(1));
        double grossPay = calcGrossPay(payPeriod);

        double fica = (0.23 * grossPay);
        double state = (0.05 * grossPay);
        double local = (grossPay * 0.1);
        double medicare = (grossPay * 0.03);
        double socialSecurity = (grossPay * 0.075);

        return new PayCheck(grossPay, fica, state, local, medicare, socialSecurity, payPeriod);

    }
    abstract double calcGrossPay(DateRange dateRange) ;

    public void addOrder(Order order){
    }
}