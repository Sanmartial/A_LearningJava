package LessonsJava.MultiThreading.videoBasic;

public class Demo_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread workerThread = new Thread(new RunnableTest());
        Thread sleeperThread = new SleeperThread();
        workerThread.setDaemon(true);
        sleeperThread.setDaemon(true);

        workerThread.start();
        sleeperThread.start();

        //Thread.sleep(3000);

//        System.out.println("Interrupted threads");
//       workerThread.interrupt();
      // sleeperThread.interrupt();


//        System.out.println("Join threads");
//        workerThread.join();
//        sleeperThread.join();

        System.out.println("All done");



    }
}

class RunnableTest implements Runnable {
    @Override
    public void run() {
        long sum = 0;
        for(int i = 0; i < 1_000_000_000; i++){
            sum+=i;
            if(i % 500000000 == 0)
            System.out.println("sum " + sum + " ");
            if(i % 100 == 0 && Thread.currentThread().isInterrupted()){
                System.out.println("Loop interrupted at i = " + sum);
                break;
            }
        }
    }
}

class SleeperThread extends Thread{
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
        System.out.println("!!!");
    }
}