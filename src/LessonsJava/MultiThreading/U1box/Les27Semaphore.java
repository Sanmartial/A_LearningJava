package LessonsJava.MultiThreading.U1box;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Les27Semaphore {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Connection connection = Connection.getConnection();

        for(int i = 0; i < 23; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    connection.Work();
                }
            });
        }
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.HOURS);
            System.out.println("All right");
        }

    }

//Singleton
class Connection{
    private static Connection connection = new Connection();
    private int connectionCount;
    Semaphore semaphore = new Semaphore(10);

    private Connection(){

    }
    public static Connection getConnection(){
        return  connection;
    }
    public void Work(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{
        doWork();
        }
        finally {
            semaphore.release();
        }


    }

    public void doWork(){
        synchronized ( this ){
            connectionCount++;
            System.out.println(connectionCount);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized ( this ){
            connectionCount--;
           // System.out.print("    " + connectionCount);

        }
       // System.out.println();
    }
}