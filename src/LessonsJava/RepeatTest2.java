package LessonsJava;

import com.mysql.cj.Session;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RepeatTest2 {
    public static void main(String[] args) {
        Map<Integer,Something> map = new HashMap<>();

        map.put(1,new Something("Pen", "red", 1.4, 27));
        map.put(2,new Something("Chair", "black", 7.4, 270));
        map.put(3,new Something("Computer", "grey", 5.4, 1027));
        map.put(4,new Something("Table", "brown", 8.4, 458));
        map.put(5, new Something("Lamp", "yellow", 0.4, 17));
        map.put(6,new Something("Closet", "white", 9.4, 727));

        for(Map.Entry<Integer, Something> m: map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        map.forEach((k,v) -> System.out.println(k + " " + v.getName() + " " + v.getColor()));

        System.out.println("Done");

        Predicate<Integer> predicate = x -> x > 1;
        Supplier<String> supplier = () -> {Scanner in = new Scanner(System.in);
        String line = in.nextLine();
            return line;};
        Function<String, Integer> function = (x) -> Integer.valueOf(x);
        Consumer<String> consumer = x -> {int  i = Integer.valueOf(x);
            System.out.println("consumer " + (i + 999));};
        System.out.println("supplier " + supplier.get());
        System.out.println("predicate " + predicate.test(-8));
        int i = function.apply(supplier.get());
        System.out.println( i + 999);
        consumer.accept("555");

            }
}
