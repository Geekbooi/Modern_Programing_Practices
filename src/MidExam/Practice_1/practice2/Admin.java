package MidExam.Practice_1.practice2;


import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        double sum = 0;
        for(Employee e : list)
        {
            sum += e.computeUpdatedBalanceSum();
        }
        return sum;
    }
}