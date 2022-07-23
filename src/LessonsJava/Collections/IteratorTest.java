package LessonsJava.Collections;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addElements(list);

        Collections.sort(list);
        Iterator i = list.iterator();
        ListIterator li = list.listIterator();
        System.out.println(1);
        while (li.hasNext()){System.out.print(li.next() + " ");} System.out.println(); System.out.println(2);

        for (Integer in: list) System.out.print(in + " ");System.out.println();System.out.println(3);System.out.println(list);

        if(list.contains(112))
            list.remove(list.indexOf(112));

        System.out.println(list);

        Integer [] array = new Integer[list.size()];
        list.toArray(array);
        System.out.println(4);
        for(int a: array)
            System.out.print(a + " ");

        list.add(112);
        Collections.sort(list);
        List linkedList = new LinkedList<String>();
        linkedList.add("Roman");
        linkedList.add("Juliet");
        linkedList.add("Richard");
        ListIterator<String> liter = linkedList.listIterator();
       liter.next();
        liter.add("Bob");
        System.out.println(linkedList.size());
        for (Object sss: linkedList)
            System.out.println(sss);
        System.out.println();
        liter.previous();
        liter.previous();
        System.out.println(liter.previousIndex());
        while(liter.hasNext())
        System.out.println(liter.next());
        System.out.println(liter.previousIndex());
        liter.add("John");

        System.out.println(liter.previousIndex());
        for(int j = 0; j < liter.previousIndex(); j++) {
            liter.previous();
            System.out.println(liter.previousIndex());
        }

        while(liter.hasNext())
            System.out.println(liter.next());
        ListIterator liter1 = linkedList.listIterator();
        System.out.println(linkedList.contains("John"));
        liter.set("AliBaba");
        System.out.println(linkedList.contains("John"));
        while(liter1.hasNext())
            System.out.println(liter1.next());
        if(linkedList.contains("R1oman"))
            linkedList.remove("Roman");
        System.out.println(linkedList);



    }

    static void addElements (Collection<Integer> list){
        list.add(1); list.add(2); list.add(345);
        list.add(2167);
        list.add(112);
        list.add(19);
    }
}
