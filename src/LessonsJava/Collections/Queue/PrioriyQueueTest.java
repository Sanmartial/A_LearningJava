package LessonsJava.Collections.Queue;

import LessonsJava.Collections.AddElements;

import java.time.LocalDate;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioriyQueueTest {
    public static void main(String[] args) {
        var pg = new PriorityQueue<LocalDate>();
        pg.add(LocalDate.of(1906,12,9));
        pg.add(LocalDate.of(1933,4,13));
        pg.add(LocalDate.of(1959,6,19));
        pg.add(LocalDate.of(1976,2,29));
        pg.add(LocalDate.of(1986,11,13));
        pg.add(LocalDate.of(1966,9,5));

        System.out.println("Iteratin over element .  .   .");
        for(LocalDate date: pg)
            System.out.println(date);
        System.out.println("Removing elements  .   .   .");
        while(!pg.isEmpty())
            System.out.println(pg.remove());

       Queue<Integer> fg = new PriorityQueue<>();
        var ae = new AddElements();
        ae.addInteger(fg);
        for(Integer i: fg)
            System.out.println(i);
       for(int j = 0; j < fg.size(); j++)
            System.out.println(fg.remove());

        System.out.println(fg);

    }
}
