package LessonsJava.MultiThreading.Java2;

public class TestMTDeadLock {
    final static Object lock1 = new Object();
    final static Object lock2 = new Object();

    public static void main(String[] args) {
        ThreadDeadLock1 thread1 = new ThreadDeadLock1();
        ThreadDeadLock2 thread2 = new ThreadDeadLock2();

        thread1.start();
        thread2.start();
    }
}

class ThreadDeadLock1 extends Thread{
    @Override
    public void run() {
        System.out.println("T1: attempt grab monitor object lock1");
        synchronized (TestMTDeadLock.lock1){
            System.out.println("T1: Monitor object lock1 is grabbed ");
            System.out.println("T1: attempt grab monitor object lock2");
            synchronized (TestMTDeadLock.lock2){
                System.out.println("T1: Monitors objects lock1 and lock2 are grabbed ");
        }
    }
}}
class ThreadDeadLock2 extends Thread{
    @Override
    public void run() {
        System.out.println("T2: attempt grab monitor object lock2");
        synchronized (TestMTDeadLock.lock2){
            System.out.println("T2: Monitor object lock2 is grabbed ");
            System.out.println("T2: attempt grab monitor object lock1");
            synchronized (TestMTDeadLock.lock1){
                System.out.println("T2: Monitors objects lock1 and lock2 are grabbed ");
            }
        }
    }}