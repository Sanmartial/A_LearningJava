package LessonsJava.MultiThreading.U1box;

import java.util.Scanner;

public class Les23WaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        WaitAndNotify wan = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wan.produce();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wan.consumer();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify{
    public void  produce(){
        synchronized ( this ){
            System.out.println("produce Thread started.... ");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Produce thread resume...");
        }

    }

    public void  consumer(){
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized ( this ){
            System.out.println("waiting for return key pressed");
            scanner.nextLine();
            notify();
        }

    }
}