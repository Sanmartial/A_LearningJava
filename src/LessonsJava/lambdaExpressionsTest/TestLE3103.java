package LessonsJava.lambdaExpressionsTest;

import LessonsJava.InHeritance.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.*;

public class TestLE3103 {
    public static void main(String[] args) {

        Predicate <String> isEmpty = line -> line.length() <= 0;
        System.out.println(isEmpty.test("5545454"));

        FFRR <String> ffrr = x -> x.length() >= 0;
        System.out.println(ffrr.test("test"));

        Consumer<Integer> cons = x -> System.out.println(x*2);
        cons.accept(25);
        String s1 = "Hello ";
        String s2 = "JAVA!!!";
        Supplier<String> supp = () -> {
            StringBuilder sb = new StringBuilder();
            sb.append(s1).append(s2);
            System.out.println(sb.substring(0));

            return sb.substring(0);
        };
        System.out.println(supp.get());

        Function<String, Integer> fun = x -> Integer.valueOf(x);
        System.out.println(fun.apply("5") + 14);

        BinaryOperator <String> binO = (x, y) -> new StringBuilder().append(x).append(y).substring(0);

        System.out.println(binO.apply("Hello", " Roman"));

        UnaryOperator <String> unary = x -> x.toLowerCase(Locale.ROOT);

        System.out.println(unary.apply("bjghRTkkjjFKLO"));

        List<Person2> listPerson = new ArrayList<>();
        listPerson.add(new Person2("Roman", "Globa", 46));
        listPerson.add(new Person2("Ivan", "Ivanov", 27));
        listPerson.add(new Person2("Pavel", "Sodorov", 39));
        listPerson.add(new Person2("Sergey", "Golubenko", 41));
        listPerson.add(new Person2("Irina", "Demidova", 22));

        Iterator<Person2> iter = listPerson.listIterator();
        Predicate<Person2> prePerson2 = x -> x.age > 35;

        for (int i = 0; i < listPerson.size(); i++) {
            System.out.println(listPerson.get(i).surname + " " + prePerson2.test(listPerson.get(i)));
        }

        MyFunctionInt1 <String, Person2> myFI1 = (x,y) ->{
            return (x + " " + y);
        };

MyConsumer<String> myConsumer = x -> {
    System.out.println(x + "!!!");};

myConsumer.accept("Java");

    }
}

interface FFRR <T> {
    boolean test(T t);
}

interface MyFunctionInt1 <T, N> {
    T get(T t, N n);
}

interface MyConsumer<T>{
    void accept(T t);
}
class Person2{
    String name;
    String surname;
    int age;

    public Person2(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
