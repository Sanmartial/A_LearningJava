package LessonsJava.IONIO.ExternalizableTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSerial {
    private static java.lang.Object Object;

    public static void main(String[] args) {
        Second second = (Second) readSerial();
        System.out.println(second.toString());
        System.out.println(second.getName());
    }
    public static Object readSerial() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Test\\out.dat"))){
            return ois.readObject();
        }
        catch (IOException | ClassNotFoundException e){e.printStackTrace();}
        return  Object;
    }
}
