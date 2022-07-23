package LessonsJava.MultiThreading.Java2;

public class TestMT2 {
    public static void main(String[] args) throws InterruptedException {

        Thread mythread = new Thread(new MyThread3());
        Thread mythread1 = new Thread(new MyThread3());


        mythread.start();
        mythread.join();
        mythread1.start();



    }


}



class MyThread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello JAVA!!! " + i + " " + Thread.currentThread().getName());
        }
    }
}