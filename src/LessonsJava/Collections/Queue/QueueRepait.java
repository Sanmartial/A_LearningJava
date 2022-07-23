package LessonsJava.Collections.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRepait {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(5);
        queue.add(4);
        queue.add(12);
        queue.add(123);
        queue.add(127);
        queue.add(1);
        queue.offer(52);

        //queue.remove();
        queue.poll();

        System.out.println(queue.element());
        queue.poll();

        System.out.println(queue.peek() + " @@@@");


        System.out.println(queue);
    }
}
