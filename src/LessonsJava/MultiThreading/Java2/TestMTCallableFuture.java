package LessonsJava.MultiThreading.Java2;

import java.util.concurrent.*;

public class TestMTCallableFuture {
    static long factorialResult;
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Factorial factorial = new Factorial(66L);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Long> future = executorService.submit(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        factorialResult = future.get();
        System.out.println(factorialResult);

    }
}
class Factorial implements Callable<Long> {
    long f;

    public Factorial(long f) throws InterruptedException {
        //Thread.sleep(3000);
        this.f = f;
    }

    @Override
    public Long call() throws Exception {
        if(f <= 0 ){
            throw new Exception("digital is wrong");
        }
        long result = 1;
        for (int i = 1; i <= f; i++) {
            result*= i;
        }
    return result;}
}