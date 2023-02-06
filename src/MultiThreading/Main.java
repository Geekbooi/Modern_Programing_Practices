package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) throws InterruptedException {
        PrimeCheck object1 = new PrimeCheck(1,100000);
        PrimeCheck object2 = new PrimeCheck(100001,200000);
        PrimeCheck object3 = new PrimeCheck(200001,300000);
        PrimeCheck object4 = new PrimeCheck(300001,400000);
        PrimeCheck object5 = new PrimeCheck(400001,500000);
        PrimeCheck object6 = new PrimeCheck(500001,600000);
        PrimeCheck object7 = new PrimeCheck(600001,700000);
        PrimeCheck object8 = new PrimeCheck(700001,800000);
        PrimeCheck object9 = new PrimeCheck(800001,900000);
        PrimeCheck object10 = new PrimeCheck(900001,1000000);

        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(object1));
        threads.add(new Thread(object2));
        threads.add(new Thread(object3));
        threads.add(new Thread(object4));
        threads.add(new Thread(object5));
        threads.add(new Thread(object6));
        threads.add(new Thread(object7));
        threads.add(new Thread(object8));
        threads.add(new Thread(object9));
        threads.add(new Thread(object10));


        for (Thread thread: threads) {
            thread.start();
//            thread.join();
        }
        //PrimeCheck.print();



    }
}
