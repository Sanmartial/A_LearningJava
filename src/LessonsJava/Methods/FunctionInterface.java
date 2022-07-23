package LessonsJava.Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionInterface {
    public static void main(String[] args) {
        String s = "a";
        double d = 3.22;
        Predicate <Double> isString = x -> x > 0;
        System.out.println(isString.test(d));

        //Predicate and Consumer
        ArrayList <Integer> al1 = new ArrayList();
        for (int i = 0; i < 10; i++)
            al1.add(i);

        al1.removeIf(ss -> ss % 2 == 0);
        al1.forEach(s3 -> System.out.println(s3));
        Consumer <Integer> pr = x -> System.out.println(x);
        pr.accept(256);

        //Consumer
        List<String> list = List.of("Hi", "Bye", "How are you");
        list.forEach(s22 -> System.out.println(s22));

        ArrayList al = new ArrayList();
        al.add("hello");al.add("Good day"); al.add("Bye");
        al.forEach(s23 -> System.out.println(s23));

        //Suplier
        Supplier <String> sp = () -> s.toUpperCase();
        System.out.println(sp.get());

        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        System.out.println(containsA.and(containsB).test("ABCD"));

        String str = "Hello world!";
        Consumer<String> c = x -> System.out.println(str);



        Function<String, String> f1 = s1 -> s1 + "-f1-";
        Function<String, String> f2 = s1 -> s1 + "-f2-";
        Function<String, String> f3 = s1 -> s1 + "-f3-";

        System.out.println(f1.andThen(f3).compose(f2).apply("Compose"));
        System.out.println(f1.andThen(f2).andThen(f3).apply("AndThen"));

        BinaryOperator <Integer> bi1 = (x,y) -> x / y;
        System.out.println(bi1.apply(10,2));

        UnaryOperator <String> uo1 = x -> x.toUpperCase();
        System.out.println(uo1.apply("jshjhKHKHhhkHKHkH"));
        }
    }


