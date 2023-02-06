package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeCheck implements Runnable{
    private int lowerLimit;
    private int upperLimit;
    public static List<Integer> list = new ArrayList<>();

    public PrimeCheck(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for (int i=lowerLimit;i<=upperLimit;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }

    }
//    public static void print(){
//        System.out.println(Collections.unmodifiableList(list));
//    }

}