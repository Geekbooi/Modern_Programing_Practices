package LambdaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
        public static void main(String[] args) {
            //Lambda Expression
            Function<String, String> upper = name -> name.toUpperCase();
            System.out.println(upper.apply("yoseph"));

            //using method Reference --- ClassName :: instance method
            Function<String,String> upper2 = String::toUpperCase;
            System.out.println(upper2.apply("mekonnen"));

            //Lambda Expression
            BiFunction<Integer, Integer, Double> math1 = (x,y) -> Math.pow(x,y);
            System.out.println(math1.apply(2,2));

            List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
            Function<List<String>, String> fr = (fruit) -> fruit.get(1);
            System.out.println(fr.apply(fruits));

            //using method Reference --- ClassName :: static method
            BiFunction<Integer, Integer, Double> math2 = Math::pow;
            System.out.println(math2.apply(2,3));

//            List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
//            fruits.sort(String::compareToIgnoreCase);
//            System.out.println(fruits);
        }
    }
