package LessonsJava.Networking.ServerSocketTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ThreadEchoHandler implements Runnable {
    private Socket incoming;
    public ThreadEchoHandler(Socket i) {
        incoming = i;
    }

    @Override
    public void run() {
        try {
            try {
                InputStream inputStream = incoming.getInputStream();
                OutputStream outputStream = incoming.getOutputStream();

                Scanner in = new Scanner(inputStream);
                PrintWriter printWriter = new PrintWriter(outputStream, true);
                printWriter.println("Hello! Enter BYE to exit");
                boolean done = false;
                while (!done && in.hasNextLine()) {
                    String line = in.nextLine();
                    printWriter.println("Echo: " + line);
                    if (line.trim().equals("BYE"))
                        done = true;
                }
            } finally {
                incoming.close();
            }
        }
            catch(IOException e){
                e.printStackTrace();
            }

    }
}
