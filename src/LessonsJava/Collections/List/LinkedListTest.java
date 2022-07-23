package LessonsJava.Collections.List;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> linklist = new LinkedList();
        List<Integer> arraylist = new ArrayList<>();
        ForMetjod fm = new ForMetjod();
        fm.measureTime(linklist);
        fm.measureTime(arraylist);
        LinkedList ll = new LinkedList(arraylist);
        System.out.println(ll.peekFirst());
        ListIterator lit = arraylist.listIterator();

        while(lit.hasNext()) {
            Object el = lit.next();
            System.out.print(el + ".");
        }
        //int as = (int) ll.pollFirst();
        System.out.println(ll.peekFirst());

        System.out.println(ll.getLast());
        System.out.println("!!!");
        for(int i = 0; i < ll.size(); i++) {
            ll.listIterator(i);
            System.out.print(i + " ");
        }


        System.out.println();
        ArrayList al = new ArrayList();

        // Добавляем элементы к списку массивов
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        ListIterator litr = al.listIterator();
        Iterator itr = al.iterator();
        while(litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Изменённое содержание al: ");
        itr = al.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class ForMetjod{
    public void measureTime(List <Integer> list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++)
            list.set(24, i);

        //for(int i = 0; i < 1000; i++)
            list.add(11,125);

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));

    }
}