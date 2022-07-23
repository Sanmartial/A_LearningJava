package LessonsJava.MultiThreading.U1box;

import java.util.Random;
import java.util.concurrent.*;

public class Les30CallableAndFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
       Future<Integer> future = executorService.submit(() ->{
            System.out.println("starting");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
            return new Random().nextInt(1000);

    });

        executorService.shutdown();
        System.out.println(future.get());
}
}
