package Standard_Exams;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String AccId;

    public SavingsAccount(String accId, double interestRate, double balance) {
        this.balance = balance;
        this.interestRate = interestRate;
        AccId = accId;
    }
    public String getAccountId() {
        return AccId;
    }
    public Double getBalance(){
        return balance;
    }
    public Double ComputeUpdateBalanced(){
        return balance + (balance*interestRate);
    }

}
