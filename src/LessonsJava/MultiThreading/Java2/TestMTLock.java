package LessonsJava.MultiThreading.Java2;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestMTLock {
    public static void main(String[] args) throws InterruptedException {
    Call call = new Call();
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.mobileCall();
        }
    });

    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.skypeCall();
        }
    });

    Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.whatsappCall();
        }
    });

    thread1.start();
    thread2.start();
    thread3.start();
    }
}

class Call{
    private Lock lock = new ReentrantLock();

    void  mobileCall(){
        if(lock.tryLock()) {
            //lock.lock();
            try {
                System.out.println("Mobile call starts");
                Thread.sleep(3000);
                System.out.println("Mobile call finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
        else{
            System.out.println("Phone just wait");
        }
    }

    void  skypeCall(){
        if(lock.tryLock()) {
            //lock.lock();
            try {
                System.out.println("skype call starts");
                Thread.sleep(6000);
                System.out.println("skype call finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println("Phone just wait");
        }
    }

    void  whatsappCall(){
        lock.lock();
        try {
            System.out.println("Whatsapp call starts");
            Thread.sleep(2000);
            System.out.println("Whatsapp call finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}