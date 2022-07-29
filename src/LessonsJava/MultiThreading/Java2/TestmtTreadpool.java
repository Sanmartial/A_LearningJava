package LessonsJava.MultiThreading.Java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestmtTreadpool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10 ; i++) {
            executorService.execute(new RunnableImp());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main ended");
    }
}
class RunnableImp implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(10500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}