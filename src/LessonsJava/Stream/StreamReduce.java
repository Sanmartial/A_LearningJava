package LessonsJava.Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,21,33,72,10,53,12,19,20);
        long count = list.stream().reduce((ak, el) -> el  + ak).get();
        System.out.println(count);
        System.out.println();
        List<Integer> list1 = Arrays.asList(5,21,33,72,10,53,12,10, 20, 19,20);
        long count1 = list.stream().reduce(111, (ak, el) -> el  + ak);
        System.out.println(count1);

        list1.stream().distinct().sorted().forEach(System.out::println);

        Stream<Integer> stream1 = list1.stream();
        list1.stream().count();
        //System.out.println(stream1.distinct().count());
        System.out.println("*********************");
        System.out.println(stream1.distinct().peek(x -> System.out.println(x)).count());

       List<String> listS = list.stream().map(x -> String.valueOf(x).toLowerCase(Locale.ROOT)).peek((e) -> System.out.print("," + e)).
                collect(Collectors.toList());
        System.out.println("\nSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
       listS.stream().forEach(System.out::println);



    }
}
