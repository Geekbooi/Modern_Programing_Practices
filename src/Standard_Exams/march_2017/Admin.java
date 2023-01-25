package Standard_Exams.march_2017;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Employee> list = new ArrayList<>();

    public static double computeUpdatedBalanceSum(List<Employee> list){
        double total = 0;
        for(Employee e : list) {
            total += e.computeUpdatedBalanceSum();
        }
        return total;

    }

    public void addEmployee(Employee emp){
        list.add(emp);
    }
}
