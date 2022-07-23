package LessonsJava.MultiThreading.U1box;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Les22ProduceAndConsumer_1 {
    private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
    private static void produce(){
        Random random = new Random();
        while(true){
            try {
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consumer() throws InterruptedException {
        Random random = new Random();
        while (true)
        {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(random.nextInt(10) == 5){
            System.out.println(queue.take());
            System.out.println("queue size is " + queue.size() + ". ");
        }
        }
    }

}

