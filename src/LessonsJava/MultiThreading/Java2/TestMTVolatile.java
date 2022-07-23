package LessonsJava.MultiThreading.Java2;

public class TestMTVolatile extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
       long counter = 0;
       while (b){
           counter++;
       }

        System.out.printf("Loop is finished. Counter = " + counter);

    }

    public static void main(String[] args) throws InterruptedException {

        TestMTVolatile test = new TestMTVolatile();
        test.start();
        Thread.sleep(3000);

        System.out.printf("after 3 second it is time to wake up\n");
        test.b = false;
        test.join();
        System.out.printf("\nCompleted thread");


    }
}
