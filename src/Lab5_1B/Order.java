package Lab5_1B;

import java.time.LocalDateTime;

public class Order {
    private int orderNo;
    private LocalDateTime orderDate;
    private double orderAmount;

    public Order(int orderNo, LocalDateTime orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public double getOrderAmount(){
        return orderAmount;
    }
}

