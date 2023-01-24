package Lab5_1B;

public class PayCheck {
    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;
    private DateRange payPeriod;

    public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity, DateRange payPeriod) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.payPeriod = payPeriod;
    }
    public double getNetPay(){
        return grossPay - fica - state - local - medicare - socialSecurity;
    }

    public void print(){
        System.out.println("the paycheck is as follow : " + grossPay + fica + state + local + medicare + socialSecurity + "Pay Period is: " + payPeriod.toString() + "and the net pay is " + getNetPay());
    }

}
