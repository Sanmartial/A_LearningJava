package LessonsJava.MultiThreading.Java2;

import java.util.concurrent.CountDownLatch;

public class TestMTCountDownLatch {
    static CountDownLatch countDownLatch = new CountDownLatch(1);
    private static void marketStaffOnPlace() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("count - " + countDownLatch.getCount());
    }
    private static void everyThingIsReady() throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("EveryThing is read, so let's open market");
        countDownLatch.countDown();
        System.out.println("count - " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException{
        Thread.sleep(4000);
        System.out.println("Market is open");
        countDownLatch.countDown();
        System.out.println("count - " + countDownLatch.getCount());
    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("roman", countDownLatch);

        new Friend("elena", countDownLatch);
        new Friend("sergey", countDownLatch);
        new Friend("stepan", countDownLatch);
        new Friend("maria", countDownLatch);
        new Friend("lora", countDownLatch);
        new Friend("ilon", countDownLatch);
        new Friend("pavel", countDownLatch);

        marketStaffOnPlace();
        everyThingIsReady();
        openMarket();




    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();

    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}