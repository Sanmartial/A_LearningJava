package LessonsJava.Collections;

import java.util.Collection;

public class AddElements {
    public void addInteger (Collection<Integer> list){
        list.add(1); list.add(2); list.add(345);
        list.add(2167);
        list.add(112);
        list.add(19);
    }

    public void addString (Collection<String> list2){
        list2.add("Hello"); list2.add("Hi"); list2.add("Bye");
        list2.add("New York");
        list2.add("Boston");
        list2.add("How are you!");
    }
}
