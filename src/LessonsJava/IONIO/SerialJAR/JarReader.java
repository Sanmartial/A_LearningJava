package LessonsJava.IONIO.SerialJAR;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JarReader {
    private static java.lang.Object Object;

    public static void main(String[] args) {
        FirstJAR second = (FirstJAR) readSerial();
        System.out.println(second.toString());
        System.out.println(second.getName());
    }
    public static Object readSerial() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Test\\out1.dat"))){
            return ois.readObject();
        }
        catch (IOException | ClassNotFoundException e){e.printStackTrace();}
        return  Object;
    }
}
