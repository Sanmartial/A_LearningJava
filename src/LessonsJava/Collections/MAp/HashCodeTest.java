package LessonsJava.Collections.MAp;

import java.util.*;
import java.util.HashMap;

public class HashCodeTest {
    public static void main(String[] args) {
    Map<Person, String> map = new HashMap<>();
    Set<Person> set = new HashSet<>();
    Set <PythonTest> setP = new HashSet();

    var person1 = new Person(1, "Mike");
    var person2 = new Person(2, "Mike");
    var pt1 = new PythonTest("Pinguin", "black");
    var pt2 = new PythonTest("Pinguin", "1black");

    map.put(person1, "123");
    map.put(person2, "123");

    set.add(person1);
    set.add(person2);
    setP.add(pt1);
    setP.add(pt2);

        System.out.println(map);
        System.out.println(set);

        System.out.println(setP);
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class PythonTest{
    String name;
    String color;

    public PythonTest(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "PythonTest{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythonTest that = (PythonTest) o;
        return name.equals(that.name) && color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}