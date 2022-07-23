package LessonsJava.MultiThreading.Java2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestMTCopyOnWriteArrayList {
    public static void main(String[] args) throws InterruptedException {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Roman");
        list.add("Stepan");
        list.add("Moisha");
        list.add("Taras");
        list.add("Maria");
        list.add("Irina");
        list.add("Pavel");
        list.add("Ignat");

        System.out.println(list);

        Runnable runnable = () -> {
            Iterator iterator = list.iterator();
            while (iterator.hasNext())
            {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable1 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Selena");
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(list);


    }

}
