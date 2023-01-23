package Standard_Exams;

import java.util.List;

public class Admin {
    private List<Employee> list;

    public static double computeUpdatedBalanceSum(List<Employee> list){
        double total = 0;
        for(Employee e : list) {
            total += e.computeUpdatedBalanceSum();
        }
        return total;

    }
}
