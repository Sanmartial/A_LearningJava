package LessonsJava.MultiThreading.Java2;

public class TestMTDaemon {
    public static void main(String[] args) {

        System.out.println("main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("main thread ended");

    }
}

class UserThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is Daemon: " + isDaemon());

        for (char i = 'A'; i < 'W'; i++){
            try {
                sleep(1100);
                System.out.println("         " + (char) i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

class DaemonThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is Daemon: " + isDaemon());

        for (int i = 1; i < 1000; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}