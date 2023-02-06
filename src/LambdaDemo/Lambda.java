package LambdaDemo;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public interface Lambda {
}
    class predicate {
        public static void main(String[] args) {

            Predicate<Integer> odd = (x) -> {
               if  (x % 2 == 0){
                   return false;}
                return true;
            };
            odd.test(5);
        }
    }

//public class PredicateDemo1 {
//    public static void main(String[] args) {
//        Predicate<String> numbersOnly = (input) -> {
//            for (int i = 0; i < input.length(); i++) {
//                char c = input.charAt(i);
//                if ("0123456789".indexOf(c) == -1) {
//                    return false;
//                }
//            }
//            return true;
//        };
//
//        System.out.println(numbersOnly.test("12345"));// true
//        System.out.println(numbersOnly.test("100a")); // false
//
//    }
//}
//
//public class BiFunctionDemo1 {
//    public static void main(String[] args) {
//        BiFunction<Float, Float, Float> area =
//                (width, length) -> width * length;
//        float width = 7.0F;
//        float length = 10.0F;
//        float result = area.apply(width, length);
//        System.out.println("Area of a Window : " + result);
//    }
//}
