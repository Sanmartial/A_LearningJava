package LessonsJava.MultiThreading.U1box;

import java.util.Scanner;

public class Les18Volatile {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        thread1.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        thread1.shutDown(thread1);

    }
}
class MyThread extends Thread{

    private volatile boolean running = true;
    @Override
    public void run() {
        while(running){
            System.out.println("Hello!!!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.printf("sleep interrupted");
            }
        }
    }

    public void shutDown(Thread t){
        this.running = false;
        //t.interrupt();
    }
}

