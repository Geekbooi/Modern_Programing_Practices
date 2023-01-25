package Lab5_1B;

import java.time.LocalDateTime;

public class HR {
    static AEmployee commissioned = new Commissioned("ID1", 0.07, 4000);
    static AEmployee salaried = new Salaried("ID2", 4000);
    static AEmployee hourly = new Hourly("Id3", 50, 40);


    public static void main(String[] args) {

        Order order1 = new Order(1, LocalDateTime.of(2022,2,1,0,0), 2);
        Order order2 = new Order(2, LocalDateTime.of(2022,2,1,0,0), 3);
        Order order3 = new Order(3, LocalDateTime.of(2022,2,1,0,0), 4);
        Order order4 = new Order(4, LocalDateTime.of(2022,2,1,0,0), 5);
        Order order5 = new Order(5, LocalDateTime.of(2022,2,1,0,0), 6);

        commissioned.addOrder(order1);
        commissioned.addOrder(order2);
        commissioned.addOrder(order3);
        commissioned.addOrder(order4);
        commissioned.addOrder(order5);

        salaried.addPaycheck(salaried.calcCompensation(1, 2021));
        salaried.addPaycheck(salaried.calcCompensation(2, 2021));
        salaried.addPaycheck(salaried.calcCompensation(3, 2021));
        salaried.print();

        System.out.println("\n------------------\t------------------\t------------------\t------------------");
        hourly.addPaycheck(hourly.calcCompensation(1, 2021));
        hourly.addPaycheck(hourly.calcCompensation(2, 2021));
        hourly.addPaycheck(hourly.calcCompensation(3, 2021));
        hourly.print();

        System.out.println("\n--------------\t------------------\t------------------\t------------------");
        commissioned.addPaycheck(commissioned.calcCompensation(1, 2022));
        commissioned.addPaycheck(commissioned.calcCompensation(2, 2022));
        commissioned.addPaycheck(commissioned.calcCompensation(3, 2022));
        commissioned.print();

    }
}
