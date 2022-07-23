package LessonsJava.IONIO.SerialJAR;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JarWriter {

    public static void main(String[] args) {
        writerClass();
    }
    public static void writerClass(){
        FirstJAR s = new FirstJAR();
        s.setLastName("Globa");
        s.setName("Roman");
        s.setOther("PoliceMan");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Test\\out1.dat"))){
            oos.writeObject(s);
        }
        catch (IOException e){e.printStackTrace();}
    }
}
