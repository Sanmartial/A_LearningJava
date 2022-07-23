package LessonsJava.Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

    public static void main(String[] args) throws FileNotFoundException {
        String ss = "C:\\Java\\file1.txt";
        File f = new File(ss);
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //f.canWrite();

    }

}
