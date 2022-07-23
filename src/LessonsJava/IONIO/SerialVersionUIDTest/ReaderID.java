package LessonsJava.IONIO.SerialVersionUIDTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderID {
    private static java.lang.Object Object;

    public static void main(String[] args) throws IOException {
        SerialDemoPlus sd = (SerialDemoPlus) serialDemoRead();
        System.out.println(sd.toString());
    }
    public static Object serialDemoRead() throws IOException {
        try(FileInputStream fis = new FileInputStream("D:\\Test\\out.data");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            return ois.readObject();
        }
        catch (IOException e){e.printStackTrace();}
        catch (ClassNotFoundException c){c.printStackTrace();}
        return Object;}//СЕРИАЛИЗАЦИЯ
}
