package LessonsJava.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(3);
        deque.add(31);
        deque.add(32);
        deque.add(23);
        deque.add(43);
        deque.add(37);
        deque.add(93);
        deque.addFirst(13);
        deque.addLast(33);

        System.out.println(deque);

    }
}
