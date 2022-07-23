package LessonsJava.MultiThreading.U1box;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Les24ProducerAndConsumer_2 {

        public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        PaC wan = new PaC();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wan.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wan.consumer();
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
}

class PaC{
    Queue<Integer> queue = new LinkedList<Integer>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void  produce() throws InterruptedException {
        Random random = new Random();
        while(true){
            synchronized ( lock ){
                while (queue.size() == LIMIT){
                    lock.wait();
                }

                queue.offer(random.nextInt(100));
                lock.notify();
            }

        }
    }

    public void  consumer() throws InterruptedException {
        while (true){
            synchronized ( lock ){
                while (queue.size() == 0){
                    lock.wait();
                }
                System.out.println(queue.poll());
                System.out.println("queue size is .. ." + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }


    }
}
