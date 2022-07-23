package LessonsJava.MultiThreading.U1box;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Les20Synchronyzed_2 {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();

    }

}

class Worker{
    Object lock1 = new Object();
    Object lock2 = new Object();

    private List <Integer> list1 = new ArrayList<>();
    private List <Integer> list2 = new ArrayList<>();

    Random random = new Random();

    public void addToList1(){
        synchronized ( lock1 ) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2(){
        synchronized ( lock2 ) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void Work(){
        for(int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {
        long start = System.currentTimeMillis();
         Thread thread1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 Work();
             }
         });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Work();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long finish = System.currentTimeMillis();

        System.out.println("time - " + (start - finish) + " milsec");

        System.out.print("list1 " + list1.size());
        System.out.println();
        System.out.print("list2 " + list2.size());
    }
}