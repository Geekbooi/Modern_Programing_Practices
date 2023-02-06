package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyOps {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "C++", "Kotlin", "HTML");

        List<String> coll = names.stream()
                .filter(s -> s.length() > 4)     //take an input and return a boolean value
                // take the input from the list
                .toList(); // terminal operation
        System.out.println("the elements greater than length 6 = " + coll.size());

        // From arrays to Streams
        Integer[] array = {1, 2, 3, 4, 5};
        Stream<Integer> int1 = Arrays.stream(array);
        System.out.println(Arrays.toString(array) + " and the size is " + int1.count());

        /*
collections of Arrays to Stream
        int[] array1 ={1,3,5,7,9};
        Stream<int[]> i = Stream.of(array1);    //converts an array of elements into a stream.
        i.forEach(System.out.println(Arrays.toString(array1) + " and the size is " + array1.count()));  //prints each element in the form of a string representation of the array,
*/

        Stream<String> song = Stream.of("gently", "country", "high")
                .reduce("" , (x, y) -> (x + " " + y)).lines();
        song.forEach(System.out::println);      // terminal operation



        //some iteration using stream
        Stream<Integer> first4Numbers = Stream.iterate(9, n -> n + 2)
                .limit(4);
        first4Numbers.forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> liststream = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)    //or so we can use, flatMap(x -> Stream.of(x, x * x))
                .toList();
        liststream.forEach(System.out::print); // output as plain
        System.out.println(liststream); // output as a list -> more recommended

        char[] char1 = {'i', 'h', 'a', 'v', 'e', 'm', 'a', 's', 't', 'e', 'r', 's'};
        Function<char[], String> convo = a -> new String(a);    // using lambda
        Function<char[], String> convo1 = String::new;   //using Class::new
        System.out.println(convo1.apply(char1));

        //flatmap usage
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list1 = nums.stream()
                .flatMap(x -> Stream.of(x, x * x))//stream<stream>integer
                .toList();
        System.out.println(list1);

        //more precise and accurate code for the above code
        List<Integer> list2 = nums.stream()
                .map(x -> x * x)//stream<stream>integer
                .toList();// collect and foreach, we can use alternatively
        System.out.println(list2);


        List<String> words = Arrays.asList("Java", "Design pattern", "Dsa");
        List<String> words1 = Arrays.asList("Java", "Design pattern", "DSA");
        //Flattening the Stream of String into single Stream
        words1.stream()
                .flatMap(word -> word.chars()
                        .mapToObj(c -> (char) c + ""))
                .forEach(System.out::print);


        //sorting
        Stream<String> flow = words.stream()
                .sorted();
        //flow.forEach(System.out::println);
        System.out.println(flow.collect(Collectors.toList()));

        //length of each size
        IntStream length = names.stream()
                        .mapToInt(String::length);
        System.out.println("Length of String list names" );
        System.out.println(length);
        //length.forEach(System.out::println);
        
        //using map
        List<Integer> len1 = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(len1);
        
        // using List of strings that stores an ordered collection of elements.
        List<String> s1 = words.stream()
                .filter(x -> x.startsWith("D"))
                        .collect(Collectors.toList());
        //s1.forEach(System.out::println);
        System.out.println(s1);

        //using stream of elements that can be processed in a pipeline of operations.
        Stream<String> s2 = words.stream()
                .filter(x -> x.startsWith("D"));    //Intermediate operation
        s2.forEach(System.out::println);    //terminal operation


    }
}
