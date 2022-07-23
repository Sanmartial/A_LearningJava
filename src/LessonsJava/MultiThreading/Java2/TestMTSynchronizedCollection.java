package LessonsJava.MultiThreading.Java2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMTSynchronizedCollection {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer>sourse = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sourse.add(i);
        }
        List<Integer> target = Collections.synchronizedList(new ArrayList<>());


        Runnable runnable = () -> {target.addAll(sourse);};

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread1.start();

        thread.join();
        thread.join();

        System.out.println(target);
    }
}
