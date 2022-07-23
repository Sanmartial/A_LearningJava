package LessonsJava.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Roman1");
        set.add("Roman2");
        set.add("Roman3");
        set.add("Roman4");
        set.add("Roman5");
        set.add("Roman6");
        set.add("Roman7");

        Set<String> setTwo = new HashSet<>();
        setTwo.add("Roman1");
        setTwo.add("Roman8");
        setTwo.add("Roman3");
        setTwo.add("Roman4");
        setTwo.add("Roman9");
        setTwo.add("Roman16");
        setTwo.add("Roman7");

        Set<String> union = new HashSet<>(set);
        //union.addAll(setTwo);
        //union.removeAll(setTwo);
        union.retainAll(setTwo);

        for(String u: union)
        System.out.println(u);





    }
}
