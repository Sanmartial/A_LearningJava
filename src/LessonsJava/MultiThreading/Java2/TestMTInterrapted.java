package LessonsJava.MultiThreading.Java2;

public class TestMTInterrapted {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();

        Thread.sleep(2000);
        interruptedThread.interrupt();
        interruptedThread.join();

        System.out.println("Main thread ended");

    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 1; i < 100000000; i++) {
            if(isInterrupted()){
                System.out.println("Thread will want interrupt");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread is interrupted");
                return;
            }
            sqrtSum+=i;
            System.out.print("* ");
        }
        System.out.println(sqrtSum);
    }
}