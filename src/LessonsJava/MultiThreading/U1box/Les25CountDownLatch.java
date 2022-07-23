package LessonsJava.MultiThreading.U1box;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Les25CountDownLatch {
    protected final int LIMIT = 13;
    public static void main(String[] args) throws InterruptedException {
        Les25CountDownLatch l = new Les25CountDownLatch();
        int limit = l.LIMIT;
        CountDownLatch countDownLatch = new CountDownLatch(limit);
        ExecutorService executorService = Executors.newFixedThreadPool(limit);
        for(int i = 0; i < limit; i++)
            executorService.submit(new Processor(i, countDownLatch));

        executorService.shutdown();
        for(int i = 0; i < limit; i++){
            Thread.sleep(1000);
            countDownLatch.countDown();
        }    }   }
class Processor implements Runnable{
    Les25CountDownLatch l = new Les25CountDownLatch();
    int limit = l.LIMIT;
    private int ID;

    public Processor(int ID, CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.ID = ID;
    }

    private CountDownLatch countDownLatch;
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread ID " + ID + " proceeded");
    }
}