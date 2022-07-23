package LessonsJava.MultiThreading.Java2;

public class TestMTMonitor {
    static final Object lock = new Object();
    void mobileCall(){
        synchronized (lock) {
            System.out.printf("mobile call starts\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Mobile call finished\n");
        }}

    void SkypeCall(){
        synchronized (lock) {
        System.out.printf("Skype call starts\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Skype call finished\n");
    }}
    void WhatsappCall(){
        synchronized (lock) {
        System.out.printf("Whatsapp call starts\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Whatsapp call finished\n");
    }}

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunImpMobile());
        Thread thread2 = new Thread(new RunImpSkype());
        Thread thread3 = new Thread(new RunImpWhatsapp());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class RunImpMobile implements Runnable{
    @Override
    public void run() {
    new TestMTMonitor().mobileCall();
    }
}

class RunImpSkype implements Runnable{
    @Override
    public void run() {
        new TestMTMonitor().SkypeCall();
    }
}

class RunImpWhatsapp implements Runnable{
    @Override
    public void run() {
        new TestMTMonitor().WhatsappCall();
    }
}

class Monitor{}