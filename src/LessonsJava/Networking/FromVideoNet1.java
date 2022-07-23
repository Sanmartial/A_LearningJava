package LessonsJava.Networking;

import ApplicationReZerV.CommonMethods.CommonMethods;

import java.io.*;
import java.net.Socket;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

public class FromVideoNet1 {
    public static void main(String[] args) throws IOException {
        try(Socket socket = new Socket("java-course.ru", 80);){
            socket.setSoTimeout(2000);

            StringBuilder sb1 = new StringBuilder("GET /haiku.html HTTP/1.1");
            sb1.append(System.lineSeparator());
            sb1.append("Host: java-course.ru").append(System.lineSeparator());
            sb1.append("Connection: close").append(System.lineSeparator());
            sb1.append(System.lineSeparator());
            try(OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "cp1251"));){
            os.write(sb1.toString().getBytes());
            String line;
                List<String> list = new ArrayList<>();

            while ((line = br.readLine()) != null){
                list.add(line);
                line= br.readLine();
            }
            CommonMethods.writeList(list, "D:\\Test\\FILE.txt");
                System.out.println("Done");
        } catch (NoSuchFileException n){
            System.out.println("Error " + n.toString());

        } catch (IOException e){
                e.printStackTrace();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
