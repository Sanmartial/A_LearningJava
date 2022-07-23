package LessonsJava.IONIO.Java2;

import ApplicationReZerV.CommonMethods.CommonMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferChanelTest {
    public static void main(String[] args) {
        String path = "D:\\Test\\gmail1.txt";

        try(RandomAccessFile raf = new RandomAccessFile(path, "rw");
        FileChannel chanel = raf.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(4096);
            StringBuilder sb1 = new StringBuilder();
            int byteRead = chanel.read(buffer);
            while(byteRead > 0){
                System.out.println("read " + byteRead);
                buffer.flip();
                while(buffer.hasRemaining()){
                    sb1.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = chanel.read(buffer);
            }
            //System.out.println(sb1);

            String textAdd = "\nglobaroman1975@gmail.com 1reredne";
            ByteBuffer buffer2 = ByteBuffer.wrap(textAdd.getBytes());
            chanel.write(buffer2);
//            ByteBuffer buffer2 = ByteBuffer.allocate(textAdd.getBytes().length);
//            buffer2.put(textAdd.getBytes());
//            buffer2.flip();
//            chanel.write(buffer2);

            CommonMethods.showList(CommonMethods.readerListAll(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
