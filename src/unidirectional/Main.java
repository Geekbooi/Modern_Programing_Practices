package unidirectional.oneToZeroOne;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Bob");
        //making one-one unidirectional - customer -> Shopping cart
        ShoppingCart cart = ShoppingCart.newShoppingCart(cust);
        cart.addItem(new Item("Shirt"));
        cart.addItem(new Item("pants"));
        cart.addItem(new Item("T-Shirt"));
        System.out.println(cust.getCart().getItems());
    }
}
