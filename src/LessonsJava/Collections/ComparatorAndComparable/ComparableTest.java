package LessonsJava.Collections.ComparatorAndComparable;

import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        List<Person1> peopleList = new ArrayList<>();
        Set<Person1> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);
        //Collections.sort(peopleSet);

        System.out.println(peopleList);
        //System.out.println(peopleSet);

        List<Integer> listT = Arrays.asList(1,5,55,73,4,12,98,-25,11,2);
        Collections.sort(listT);
        System.out.println(listT);
        System.out.println(Collections.binarySearch(listT, 5));



    }

    static void addElements (Collection collection){
        collection.add(new Person1(101213, "Michael"));
        collection.add(new Person1(101315, "Roger"));
        collection.add(new Person1(101723, "Kat"));
        collection.add(new Person1(101511, "Richarrd"));
        collection.add(new Person1(101219, "John"));

    }
}

class Person1 implements Comparable<Person1> {
    private int ID;
    private String name;

    public Person1(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return ID == person1.ID && name.equals(person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name);
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

    @Override
    public int compareTo(Person1 p1) {
        if(this.ID > p1.ID)
            return 1;
        else if(this.ID > p1.ID)
            return -1;
        else
        return 0;
    }
}