package LessonsJava.MultiThreading;

import java.util.concurrent.*;

public class TestThreadTest_1 {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CallableTest callableTest = new CallableTest();
       Future<String> future =  executorService.submit(() -> callableTest.call());
       executorService.shutdown();

       executorService.awaitTermination(1, TimeUnit.HOURS);
        System.out.println(future.get());

        Thread thread = new Thread();
        thread.setPriority(3);



    }//main

}//main class

class CallableTest implements Callable{
    @Override
    public String call() throws Exception {
        System.out.println("Starting");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String s = "Finishing!";
        return s;

    }
}

