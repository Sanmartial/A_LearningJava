package LessonsJava.Collections.Queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {
    public static void main(String[] args) {
        Person person1 = new Person(101231);
        Person person2 = new Person(101242);
        Person person3 = new Person(101723);
        Person person4 = new Person(101814);
        Person person5 = new Person(101555);
        Person person6 = new Person(101316);
        Person person7 = new Person(101917);

        //Queue<Person> people = new LinkedList<>();
        Queue<Person> people = new ArrayBlockingQueue<>(10);
        people.offer(person1);
        people.add(person5);
        people.offer(person3);
        people.add(person4);
        people.offer(person2);
        people.add(person7);
        people.offer(person6);

        System.out.println(people);
        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);

    }

}
class Person{
    int ID;

    public Person(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ID == person.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Person - " +
                "ID= " + ID + "\n";
    }
}