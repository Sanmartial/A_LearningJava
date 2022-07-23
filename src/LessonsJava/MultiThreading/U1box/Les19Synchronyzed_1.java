package LessonsJava.MultiThreading.U1box;

public class Les19Synchronyzed_1 {
    private  int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        var test  = new Les19Synchronyzed_1();
        test.doWork();
    }//main
    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("counter - " + counter);
    }//method doWork

    private void increment() {
        synchronized ( this ){counter++;
    }}
}//this.class

