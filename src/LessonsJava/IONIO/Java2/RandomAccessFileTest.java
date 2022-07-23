package LessonsJava.IONIO.Java2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\globa\\OneDrive\\Рабочий стол\\xx.txt";

        try(RandomAccessFile raf = new RandomAccessFile(path, "rw")){
            int bite;
            String line;
            long pointer = 0;
            while ((line = raf.readLine()) != null){
                System.out.print(line);
                System.out.println(" "  +  raf.getFilePointer());
                pointer = raf.getFilePointer();
            }
            raf.seek(pointer);
            raf.writeBytes("The end file...Конец файла");
        }
        catch (IOException e){e.printStackTrace();}
    }
}
