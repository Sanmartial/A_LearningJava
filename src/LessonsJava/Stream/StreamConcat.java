package LessonsJava.Stream;

import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,5,5,78,9,2,6,44,5,15,2,22).distinct();
        //stream.forEach(System.out::println);
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        Stream<Integer> stream2 = Stream.of(11,15,51,278,19,22,63,244,57,215,21,122);
        Stream<Integer> stream4 = Stream.concat(stream,stream2);
        stream4.sorted().forEach(System.out::println);
        System.out.println("^^^^^^^^^^^^^^^^^^^");
        Stream<Integer> stream1 = Stream.of(11,15,51,278,19,22,63,244,57,215,21,122, 11, 1, 1, 51);
        stream1.distinct().forEach(System.out::println);
        System.out.println("********************");

    }
}
