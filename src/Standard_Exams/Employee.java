package Standard_Exams;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> acct;

    public Employee(String name) {
        this.name = name;
        acct = new ArrayList<>();
    }

    public double computeUpdatedBalanceSum() {
        //implement
        double total=0;
        for(Account A : acct){
            total += A.ComputeUpdateBalanced();
        }
        return total;
    }
    public String getName(){
        return name;
    }
    public void addAccount(Account account){
        acct.add(account);
    }

}
