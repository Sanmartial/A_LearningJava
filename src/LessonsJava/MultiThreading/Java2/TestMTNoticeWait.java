package LessonsJava.MultiThreading.Java2;

public class TestMTNoticeWait {
    public static void main(String[] args) {
    MarketBread marketBread = new MarketBread();
    Producer producer = new Producer(marketBread);
    Consumer consumer = new Consumer(marketBread);
    Thread thread1 = new Thread(producer);
    Thread thread2 = new Thread(consumer);
    thread1.start();
    thread2.start();
    }
}

class MarketBread{
    private int breadCount = 0;

    public synchronized void getBread(){
        while (breadCount < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Consumer bought 1 bread");
        System.out.println("Amount breads in the market is " + breadCount);
        notify();
    }

    public synchronized void putBread(){
        while(breadCount >=5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Producer added on the showcase 1 bread");
        System.out.println("Amount breads in the market is " + breadCount);
        notify();
    }
}

class Producer implements Runnable{
    MarketBread market;

    public Producer(MarketBread market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    MarketBread market;

    public Consumer(MarketBread market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}