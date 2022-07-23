package LessonsJava.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFlapMap {
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

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied math");

        f1.addStudentToFacylty(st1);
        f2.addStudentToFacylty(st3);
        f1.addStudentToFacylty(st4);
        f2.addStudentToFacylty(st2);
        f1.addStudentToFacylty(st6);
        f2.addStudentToFacylty(st5);

        List<Faculty>facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentOnFaculty().stream()).forEach(e -> System.out.println(e.getName()));
        System.out.println("collet");
        Map<Object, List<StudentStream>> map1 = list.stream().map(x -> {x.setName(x.getName().toUpperCase(Locale.ROOT)); return x;}).collect(Collectors.groupingBy(x -> x.getCourse()));

        map1.forEach((k, v) -> System.out.println(k  + " " + v));

        System.out.println("///////////////////////////////////");

        Map<Boolean, List<StudentStream>> map2 = list.stream().collect(Collectors.partitioningBy(x -> x.getAveradge() > 7));
        map2.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println("findFirst");
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny());
        System.out.println("min");
        System.out.println(list.stream().min((x,y) -> x.getAge()-y.getAge()));
        System.out.println(list.stream().max((x,y) -> x.getAge()-y.getAge()));
        System.out.println("limit");
        list.stream().filter(x -> x.getAge() > 20).limit(3).forEach(System.out::println);
        System.out.println("skip");
        list.stream().filter(x -> x.getAge() > 20).skip(2).forEach(System.out::println);
        System.out.println("mapToInt");
        List<Integer> listIn = list.stream().mapToInt(x -> x.getAge()).boxed().collect(Collectors.toList());
        listIn.stream().sorted().forEach(System.out::println);
        int sum = listIn.stream().mapToInt(x -> x.intValue()).sum();
        System.out.println(sum);
        Double doubleA = listIn.stream().mapToInt(x -> x.intValue()).average().getAsDouble();
        System.out.println(doubleA);
        System.out.println("min");
        int min = listIn.stream().mapToInt(x -> x.intValue()).min().getAsInt();
        System.out.println(min);
        System.out.println("max");
        int max = listIn.stream().mapToInt(x -> x.intValue()).max().getAsInt();      System.out.println(max);
    }
}
class Faculty {
    String name;
    List<StudentStream>studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentOnFaculty = new ArrayList<>();
    }

    public List<StudentStream> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public void addStudentToFacylty(StudentStream st){
        studentOnFaculty.add(st);
    }
}