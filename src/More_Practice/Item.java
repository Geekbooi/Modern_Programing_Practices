package More_Practice;

public class Item {
    private String name;
    private Order orders;
    public Item(String name, Order orders){
        this.name = name;
        this.orders=orders;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
