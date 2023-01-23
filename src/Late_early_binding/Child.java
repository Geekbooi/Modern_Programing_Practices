package Late_early_binding;

public class Child extends Parent{
    public static void main(String[] args) {
        Parent P = new Child();
        P.print(); // Early Binding happen for static
        P.display(); // Late Binding happen for non-static, non-private
    }

    public static void print(){
        System.out.println("Child Static");
    }
    @Override
    public void display(){
        System.out.println("Child Non-Static");
    }
}
