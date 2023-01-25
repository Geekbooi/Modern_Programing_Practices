package Standard_Exams.march_2017;

public class CheckingAccount extends Account{
    private Double balance;
    private Double monthlyFee;
    private String AccId;

    public CheckingAccount(String accId, double monthlyFee, double balance) {
        this.balance = balance;
        this.monthlyFee = monthlyFee;
        AccId = accId;
    }
    public String getAccountId() {
        return AccId;
    }
    public Double getBalance() {
        return balance;
    }
    public Double ComputeUpdateBalanced() {
        return balance-monthlyFee;
    }
}

