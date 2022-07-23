package LessonsJava.MultiThreading.U1box;

import java.util.Random;

public class Les29ThreadFinish {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000_000_000; i++) {
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    System.out.println(Math.sin(new Random().nextDouble()));
                   }
            }
        });

        System.out.println("Start thread....");
        thread.start();
        Thread.sleep(15000);
        thread.interrupt();
        thread.join();


        System.out.println("Thread has finished");
    }
}
