package LessonsJava.IONIO.Java2;

import ApplicationReZerV.CommonMethods.CommonMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class IORepeat {
  public static void main(String[] args) {
        String path = "D:\\Test\\gmail1.txt";
        String path1 = "D:\\Test\\picture.jpg";
        String path2 = "D:\\Test\\test1.txt";
      List<Character> list = new ArrayList<>();

        File file = new File(path);

     try(RandomAccessFile raf = new RandomAccessFile(path, "rw");
         RandomAccessFile raf1 = new RandomAccessFile(path2, "rw");
     FileChannel channel = raf.getChannel();
         FileChannel channel1 = raf1.getChannel();) {
         ByteBuffer buffer = ByteBuffer.wrap(path.getBytes());
         StringBuilder sb1 = new StringBuilder();
         int bytes = channel.read(buffer);
         while (bytes > 0){
             buffer.flip();
             while(buffer.hasRemaining()){
                 //System.out.println((char) buffer.get());
                 sb1.append((char) buffer.get());

             }
             buffer.clear();
             bytes = channel.read(buffer);
         }
         System.out.println(sb1);
         String test = "\nTHE END";
         ByteBuffer buffer1 = ByteBuffer.wrap(sb1.substring(0).getBytes());
         channel1.write(buffer1);



     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }


  }
}
