package LessonsJava.IONIO.Java2.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerInput {
    public static void main(String[] args) {

        EmployeeMonth employeeMonth;

        try(ObjectInputStream bis = new ObjectInputStream(new FileInputStream("empMonth.bin"))){
            employeeMonth = (EmployeeMonth) bis.readObject();

            System.out.println(employeeMonth);
        }
        catch (IOException | ClassNotFoundException e){e.printStackTrace();}
    }
}
