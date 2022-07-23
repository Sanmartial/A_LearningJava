package LessonsJava.IONIO.SerialVersionUIDTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterID {
    public static void main(String[] args) throws IOException {

        serialDemoWrite();
    }

    public static void serialDemoWrite() throws IOException {
        SerialDemoPlus sd = new SerialDemoPlus();
        sd.setCode("ROman");
        sd.setName("Globa");
        sd.setNamePlus("Nikolay");
        sd.setCodePlus("PoliceMan");
        //sd.setOther("PoliceMan");


        try(FileOutputStream fos = new FileOutputStream("D:\\Test\\out.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(sd);
        }
    }//СЕРИАЛИЗАЦИЯ
}
