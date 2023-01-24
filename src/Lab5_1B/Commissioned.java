package Lab5_1B;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends AEmployee {
    private final double commission;
    private final double baseSalary;
    private final List<Order> orders;

    public Commissioned(String name,double baseSalary,double commission) {
        super(name);
        this.baseSalary = baseSalary;
        orders = new ArrayList<>();
        this.commission = commission;
    }
    @Override
    double calcGrossPay(DateRange dateRange) {
        double totalToPay = baseSalary;
        if(orders.size()>0)
            for(Order o:orders)
            {
                    totalToPay += o.getOrderAmount() * commission;
                }

        return totalToPay;

    }
    public void addOrder(Order order){
        this.orders.add(order);
    }
}
