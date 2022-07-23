package LessonsJava.MultiThreading.Java2;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TestRepeat {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Roman");
        map.put(2, "Alena");
        map.put(3, "Maria");
        map.put(4, "Alla");
        map.put(5, "Evgen");
        map.put(6, "Pavel");
        map.put(7, "Stepan");
        map.put(8, "Michal");

        Runnable runnable = () ->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int i = iterator.next();
                System.out.println(i + " " + map.get(i));
            }
        };

        Runnable runnable1 = () ->{
            map.put(9, "Anton");
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();




    }
}
