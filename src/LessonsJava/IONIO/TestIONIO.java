package LessonsJava.IONIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TestIONIO {
    static String path1 = "D:/Test/text1.txt";
    static String path = "D:/Test/text.txt";
    static String path2 = "D:/Test/text2.txt";
    static String gmail = "D:/Test/gmail.txt";
    static String gmail1 = "D:/Test/gmail1.txt";
    static String reg = "D:/Test/11.xls";
    static String reg1 = "D:/Test/111.xls";
    static String file = "D:\\Test\\";
    static String logo = "D:\\Test\\logo.MP4";


    static List<String> list = new ArrayList<>();
    static final int SIZE = 1024 * 8;
    static StringBuilder sb = new StringBuilder();
    private static java.lang.Object Object;

    public static void main(String[] args) throws IOException, InterruptedException {

    Thread thread1 = new Thread(){
        @Override
        public void run() {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Test\\testTh.txt"))){
                bw.write("Hello JavA!!!");

            }
            catch (IOException e){e.printStackTrace();}
        }
    };

    Thread thread2 = new Thread(){
        @Override
        public void run() {
            try(BufferedReader br = new BufferedReader(new FileReader("D:\\Test\\testTh.txt"))){
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);

                }
            }
            catch (IOException e){e.printStackTrace();}
        }
    };

    thread1.start();
    Thread.sleep(1000);
        thWriter thW = new thWriter();
    thread2.start();
    thread1.join();
    thread2.join();

    } //this main

static class thWriter extends Thread {
    public thWriter() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Test\\testTh.txt"))){
            bw.write("Hello from method thWriter");
        }
        catch (IOException e){e.printStackTrace();}
        start();
    }
}

}// this class






