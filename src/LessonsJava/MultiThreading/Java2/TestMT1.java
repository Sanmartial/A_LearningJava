package LessonsJava.MultiThreading.Java2;

public class TestMT1 {
    public static void main(String[] args) throws InterruptedException {
        long time= System.currentTimeMillis();
        //Thread.sleep(3000);
        long time1= System.currentTimeMillis();
        //System.out.println(time1 - time);
        Thread thread1 = new Thread(new MyThread1());
        Thread thread2 = new Thread(new MyThread2());

        thread1.start();
        thread2.start();


    }
}

class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 1000000; i++) {
            if(i % 10000 == 0)
                System.out.println(i );

        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1000000; i >= 1; i--) {
            if(i % 10000 == 0)
            System.out.println(i + " " + " #");

        }
    }
}