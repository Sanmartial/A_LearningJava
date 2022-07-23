package LessonsJava.IONIO.Java2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ByteBufferChanelTest2 {
    public static void main(String[] args) {
        String path = "D:\\Test\\gmail1.txt";

        try(RandomAccessFile raf = new RandomAccessFile(path, "rw");
            FileChannel channel = raf.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(40);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind();
            System.out.println(".................................");
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while(buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }

            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.mark();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println("!!!!!!!!!!!!!!!!!!");
            buffer.reset();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
