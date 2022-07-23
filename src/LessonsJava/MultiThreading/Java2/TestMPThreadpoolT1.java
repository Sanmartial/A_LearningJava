package LessonsJava.MultiThreading.Java2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestMPThreadpoolT1 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledEx = Executors.newScheduledThreadPool(5);

        for (int i = 0; i < 10; i++) {
//            scheduledEx.schedule(new RunnableImp1(), 2, TimeUnit.SECONDS);
//            scheduledEx.scheduleAtFixedRate(new RunnableImp1(), 3, 1, TimeUnit.SECONDS);
            scheduledEx.scheduleWithFixedDelay(new RunnableImp1(), 3, 1, TimeUnit.SECONDS);
        }
        scheduledEx.awaitTermination(10, TimeUnit.SECONDS);
        scheduledEx.shutdown();
        System.out.println("thread main ended running");
    }
}

class RunnableImp1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ended work");
    }
}