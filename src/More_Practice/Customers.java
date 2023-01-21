package More_Practice;

public class Customers {
    private String name;
    private Order orders;

    public Customers(String name){
        this.name = name;
        orders = new Order(this);
    }
    public String getName(){
        return name;
    }
    public Order getOrder(){
        return orders;
    }
}
