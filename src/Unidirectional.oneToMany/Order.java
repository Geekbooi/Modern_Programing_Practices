package unidirectional.oneToZeroOne;

import java.util.*;

public class Order {
    private ArrayList<Item> items;
    public  void addItem(Item item){
        items.add(item);
    }

    //use a factory method for construction
    private Order(Customer cust){
        items = new ArrayList<Item>();
        cust.setCart(this);
        //if the constructor is private, to get the object of that class make use of static factory method
    }
    public static unidirectional.oneToZeroOne.Order newShoppingCart(Customer cust){
        return new unidirectional.oneToZeroOne.Order(cust);
    }

    public List<Item> getItems(){
        return items;
    }
}
