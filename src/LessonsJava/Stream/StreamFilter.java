package LessonsJava.Stream;

import ApplicationReZerV.CommonMethods.CommonMethods;
import LessonsJava.lambdaExpressionsTest.LambdaJava2.StudentJ2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<StudentStream> list = new ArrayList<>();
        StudentStream st1 = new StudentStream("Ivan", 'm', 22, 3, 8.3);
        StudentStream st2 = new StudentStream("Roman", 'm', 27, 4, 6.3);
        StudentStream st3 = new StudentStream("Stepan", 'm', 21, 1, 7.5);
        StudentStream st4 = new StudentStream("Vladimir", 'm', 24, 2, 5.9);
        StudentStream st5 = new StudentStream("Maria", 'f', 26, 5, 9.5);
        StudentStream st6 = new StudentStream("Ilona", 'f', 29, 1, 6.5);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);

        List<StudentStream> list2 = list.stream().filter(x -> x.getCourse() > 2 && x.getAge() < 40).collect(Collectors.toList());
        //CommonMethods.showList(list2);
        list2.stream().forEach(x -> System.out.println(x));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);
        System.out.println("$%$%$%");
        numbers.forEach(x -> {if(x>2) {System.out.println(x);}});

        System.out.println("#####STREAM####");
        Stream<StudentStream> stream = Stream.of(st1, st2, st3, st4, st5, st6);

       stream.filter(x -> x.getCourse()> 4).forEach(x -> System.out.println(x.getName()));

       list = (ArrayList<StudentStream>) list.stream().sorted((x, y) ->{
           return x.getAge()-y.getAge();
       }).collect(Collectors.toList());
        System.out.println("$$$$$$$$");
       list.stream().forEach(System.out::println);




    }
}

class StudentStream{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double averadge = 0.00;

    public StudentStream(String name, char sex, int age, int course, double averadge) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averadge = averadge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAveradge() {
        return averadge;
    }

    public void setAveradge(double averadge) {
        this.averadge = averadge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", averadge=" + averadge +
                '}';
    }
}