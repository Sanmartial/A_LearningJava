package LessonsJava.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestNet {
    public static void main(String[] args) {
        try(Socket socket = new Socket("time-A.timefreq.bldrdoc.gov", 13)) {
            InputStream inStream = socket.getInputStream();
            Scanner in = new Scanner(inStream);

            while (in.hasNextInt()){
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
