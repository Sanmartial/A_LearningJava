package LessonsJava.Collections.MAp;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Double, Student1> treeMap = new TreeMap<Double, Student1>();
        TreeMap<Double, Student1> treeMap1 = new TreeMap<Double, Student1>();
        Student1 st1 = new Student1("Roman", "Globa", 2);
        Student1 st2 = new Student1("Semen", "Slepakov", 3);
        Student1 st3 = new Student1("Ivan", "rudenko", 1);
        Student1 st4 = new Student1("Bogdan", "stepanenko", 3);
        Student1 st5 = new Student1("Dima", "Ivanenko", 4);
        Student1 st6 = new Student1("Stepan", "Paliy", 5);
        Student1 st7 = new Student1("Taras", "Kozel", 5);
        Student1 st8 = new Student1("Maria", "Tarasova", 2);
        Student1 st9 = new Student1("Svetlana", "Globa", 1);

        treeMap.put(5.9, st1);
        treeMap.put(7.2, st2);
        treeMap.put(4.9, st9);
        treeMap.put(8.9, st4);
        treeMap.put(9.3, st3);
        treeMap.put(7.3, st5);
        treeMap.put(6.3, st7);
        treeMap.put(5.0, st8);
        treeMap.put(8.5, st6);

        System.out.println(treeMap.get(7.2));
        System.out.println(treeMap.remove(8.5));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(6.3));
        System.out.println(treeMap.headMap(6.3));
        System.out.println(treeMap.lastEntry().getKey());


    }
}

class Student1 implements Comparable<Student1>{
    String name;
    String surname;
    int course;

    public Student1(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return course == student1.course && Objects.equals(name, student1.name) && Objects.equals(surname, student1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student1 o) {
        return this.name.compareTo(o.name);
    }
}