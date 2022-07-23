package ApplicationReZerV.JDBCCall102;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestJDBC {
    public static void main(String[] args) throws FileNotFoundException {
            String pathFile = "\\\\Глоба-пк\\e\\Мои документы\\1-ДОК. АНАЛit. ГРУПИ\\1-EXEL\\ADMINPRAKTIKA.xlsm";
        StringBuilder sb = new StringBuilder();
        List list = new ArrayList();
        try (PipedInputStream in = new PipedInputStream();
             PipedOutputStream out = new PipedOutputStream(in);
             BufferedReader br = new BufferedReader(new FileReader(pathFile))){
            String s = br.readLine();
            out.write(s.getBytes());
            out.flush();
            int data;
            while(in.available() > 0){
                data = in.read();
                list.add((char)data);
            }
            for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        }
            catch (IOException e){
                e.printStackTrace();
            }



    }
}
