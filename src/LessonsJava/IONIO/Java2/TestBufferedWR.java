package LessonsJava.IONIO.Java2;

import java.io.*;
import java.util.Random;

public class TestBufferedWR {

    public static void main(String[] args) {
        String pathPicture = "D:\\03-Picture\\002 (2).jpg";
        String pathResult = "result.jpg";

        try(FileInputStream bufR = new FileInputStream(pathPicture);
            FileOutputStream bufW = new FileOutputStream(pathResult)){

            int i;
            int j;
            while((i = bufR.read()) != -1){
                j = new Random().nextInt(2);
                System.out.print(i + " # " );
                bufW.write(i + j );
                System.out.println(j);
            }
            System.out.println("Done");
        }
        catch (IOException e){e.printStackTrace();}

    }

}
