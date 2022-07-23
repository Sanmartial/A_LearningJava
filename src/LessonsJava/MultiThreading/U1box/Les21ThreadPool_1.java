package LessonsJava.MultiThreading.U1box;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Les21ThreadPool_1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
         for(int i = 0; i < 15; i++){
             executorService.submit(new WorkLes21(i));
         }

         executorService.shutdown();
        System.out.println("all tasks submitted");

        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}

class WorkLes21 implements Runnable {
    private int ID;

    public WorkLes21(int ID) {
        this.ID = ID;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("work " + ID + " was completed!");
    }
}