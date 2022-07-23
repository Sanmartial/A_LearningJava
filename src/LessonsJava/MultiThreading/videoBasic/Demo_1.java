package LessonsJava.MultiThreading.videoBasic;

public class Demo_1 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new HelloThread().start();

        }
    }// main

    private static class HelloThread extends Thread{
        public void run (){
            System.out.println("Hello from " + getName() + " " + getId());

        }
    }
}//class

