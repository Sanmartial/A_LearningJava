package LessonsJava.MultiThreading.Java2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMTSynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> sourse = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            sourse.add(i);
        }

        List<Integer> synchList = Collections.synchronizedList(sourse);

        Runnable runnable = () -> {
            synchronized (synchList) {
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext())
                    System.out.println(iterator.next());
            }
            ;
        };
        Runnable runnable1 = () -> {
            synchList.remove(10);
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        System.out.println(synchList);


    }
}
