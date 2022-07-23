package LessonsJava.MultiThreading.Java2;

import java.util.concurrent.Semaphore;

public class TestMTSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new PersonSemaph("Roman", semaphore);
        new PersonSemaph("Ivan", semaphore);
        new PersonSemaph("Elena", semaphore);
        new PersonSemaph("Tomas", semaphore);
        new PersonSemaph("Bogdan", semaphore);



    }
}

class PersonSemaph extends Thread{
    String name;
    private Semaphore callBox;

    public PersonSemaph(String name1, Semaphore callBox) {
        this.name = name1;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {

        try {
            System.out.println(name + " wait");
            callBox.acquire();
            System.out.println(name + " using the telephone...");
            sleep(2000);
            System.out.println(name + " finished making phone calls.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}