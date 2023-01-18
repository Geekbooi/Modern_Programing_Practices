package unidirectional.oneToZeroOne;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Order> orders;
    public Customer (String name){
        this.name=name;
        orders = new ArrayList<Order>();
    }
    public Order addorder(LocalDate dateOforder){
        o
    }
    public String getName(){
        return name;
    }
    public void setCart(ShoppingCart cart){
        this.cart=cart;
    }
    public ShoppingCart getCart(){
        return cart;
    }
}
