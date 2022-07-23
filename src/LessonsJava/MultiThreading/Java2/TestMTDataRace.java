package LessonsJava.MultiThreading.Java2;

public class TestMTDataRace {
    public static void main(String[] args) {
    MyThreadDataRace runable = new MyThreadDataRace();
    Thread thread1 = new Thread(runable);
    Thread thread2 = new Thread(runable);
    Thread thread3 = new Thread(runable);
    Thread thread4 = new Thread(runable);

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
        }
}

class Counter {
    static int counter = 0;
}

class MyThreadDataRace implements Runnable{
    private void doWork(){
        System.out.printf("DoWork not SYNCHRONYZED" + " " + Thread.currentThread().getName()+ " " + Counter.counter +  "\n");
    }
    public void increment(){
        doWork();
        synchronized (ForSunchr.class){
        Counter.counter++;
        System.out.println(Counter.counter + " " + Thread.currentThread().getName());
    }}
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
class ForSunchr{

}