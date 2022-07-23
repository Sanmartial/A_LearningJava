package LessonsJava.IONIO.ExternalizableTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterSerial {
    public static void main(String[] args) {
            writerClass();
    }
public static void writerClass(){
        Second s = new Second();
        s.setLastName("Globa");
        s.setName("Roman");
        s.setNamePlus("Nikola");
        s.setNameCode("POLICEMAN");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Test\\out.dat"))){
            oos.writeObject(s);
        }
        catch (IOException e){e.printStackTrace();}
}
}
