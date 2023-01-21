package More_Practice;
public class Main {
    public static void main(String[] args) {

        Customers cust = new Customers("BoB");
        cust.getOrder().addItem("Shirt");
        cust.getOrder().addItem("Pants");

        System.out.println("Customer order is " + cust.getOrder().getItems());
    }
}
