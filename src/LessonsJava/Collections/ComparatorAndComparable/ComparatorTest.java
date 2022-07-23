package LessonsJava.Collections.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("dogs"); animal.add("cat"); animal.add("frog"); animal.add("cow");
        animal.add("elephant"); animal.add("elephant");

        Collections.sort(animal, new StringLengthCOmparator());
        System.out.println(animal);

        List<Integer> number = new ArrayList<>();
        number.add(5); number.add(15); number.add(52); number.add(35);
        number.add(56); number.add(45); number.add(45);

        Collections.sort(number, new BackwardsIntegerComparator());
        System.out.println(number);

        List<Person> person = new ArrayList<>();
        person.add( new Person(10122,"Mike"));
        person.add( new Person(10112,"Bob"));
        person.add( new Person(10103,"Roger"));

        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person t1, Person t2) {
                if(t1.getID() > t2.getID())
                    return 1;
                else if (t1.getID() < t2.getID())
                    return -1;
                else
                return 0;
            }
        });

        System.out.println(person);

    }
}

class StringLengthCOmparator implements Comparator<String>{

    @Override
    public int compare(String s, String t1) {
        if(s.length() > t1.length())
            return 1;
        else if (s.length() < t1.length())
                return -1;
        else{
        return 0;}
    }
}
class BackwardsIntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer t1, Integer t2) {
        if(t1 < t2)
            return 1;
        else if(t1 > t2)
            return -1;
        else
        return 0;
    }
}

class Person {
    private int ID;
    private String name;

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID= " + ID +
                " name= " + name +
                "\n";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}