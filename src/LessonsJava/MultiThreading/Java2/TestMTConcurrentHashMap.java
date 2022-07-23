package LessonsJava.MultiThreading.Java2;

import LessonsJava.Collections.MAp.HashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class TestMTConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Roman");
        map.put(2, "Tolik");
        map.put(3, "Alina");
        map.put(4, "Ivan");
        map.put(5, "Niloiya");
        map.put(6, "Slava");
        map.put(7, "Pavel");

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable1 = () ->{
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(8, "Elena");
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        System.out.println(map);
    }
}
