package MidExam.Practice_1.practice2;

public class SavingsAccount extends Account{
    private String accoutId;
    private double balance;
    private double interestRate;

    @Override
    String getAccountId() {
        return accoutId;
    }

    public double getBalance(){
        return this.balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }

    public SavingsAccount(String accoutId,double interestRate,double balance)
    {
        this.accoutId = accoutId;
        this.interestRate  = interestRate;
        this.balance = balance;
    }

}
