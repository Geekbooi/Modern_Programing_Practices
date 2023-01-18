package unidirectional.oneToZeroOne;

import java.util.*;

public class ShoppingCart {
    private ArrayList<Item> items;
    public  void addItem(Item item){
        items.add(item);
    }

    //use a factory method for construction
    private ShoppingCart(Customer cust){
        items = new ArrayList<Item>();
        cust.setCart(this);
        //if the constructor is private, to get the object of that class make use of static factory method
    }
    public static ShoppingCart newShoppingCart(Customer cust){
        return new ShoppingCart(cust);
    }

    public List<Item> getItems(){
        return items;
    }
}
