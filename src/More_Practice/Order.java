package More_Practice;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();
    private Customers owner;
    public void addItem(String itemName){
        Item item = new Item(itemName, this); // to maintain the reference of Order, not neccessary line
        items.add(item);
    }
    Order(Customers customers){
        owner=customers;
    }
    public List<Item> getItems(){
        return items;
    }
    public Customers getOwner(){
        return owner;
    }
}
