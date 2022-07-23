package LessonsJava.IONIO.Java2.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerOut {
    public static void main(String[] args) {
        CarForEmployee car = new CarForEmployee("VW", "Black");
        EmployeeMonth emp = new EmployeeMonth("Roman", 500.0, 46, car);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empMonth.bin"))){
            oos.writeObject(emp);
            System.out.println("Done");
        }
        catch (IOException e){e.printStackTrace();}
    }
}
