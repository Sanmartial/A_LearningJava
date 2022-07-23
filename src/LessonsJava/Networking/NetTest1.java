package LessonsJava.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class NetTest1 {
    public static void main(String[] args) {
        try(Socket socket = new Socket("olx.ua", 80); ) {
            socket.setSoTimeout(5000);
            System.out.println("connect");
            InputStream stream = socket.getInputStream();
            Scanner in = new Scanner(stream);

            String line = null;
            while (in.hasNextLine()){
                line = in.nextLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
