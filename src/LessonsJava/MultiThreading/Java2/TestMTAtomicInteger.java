package LessonsJava.MultiThreading.Java2;

import java.util.concurrent.atomic.AtomicInteger;

public class TestMTAtomicInteger {
    static AtomicInteger counter = new AtomicInteger();

    static void increment(){
        //counter++;
        counter.addAndGet(14);
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunAtom());
        Thread thread1 = new Thread(new MyRunAtom());
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        System.out.println(counter);

    }
}

class MyRunAtom implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            TestMTAtomicInteger.increment();
        }
    }
}