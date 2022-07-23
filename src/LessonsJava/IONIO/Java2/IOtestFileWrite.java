package LessonsJava.IONIO.Java2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOtestFileWrite {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\nНепонятного нет для меня под луной.\nМне известно, что мне ничего не известно!\nВот последняя правда, открытая мной.";
        String path = "C:\\Users\\globa\\OneDrive\\Рабочий стол\\result.txt";
        String pathXX  = "C:\\Users\\globa\\OneDrive\\Рабочий стол\\xx.txt";

        List<Character> list = new ArrayList<>();

//        FileReader rider = null;
//        FileWriter writer = null;
        try (FileReader rider = new FileReader(pathXX)){

            int chararcter;
            while((chararcter = rider.read()) != -1){
                list.add((char)chararcter);
            }
            System.out.println("\n");
            System.out.println("Done");
        }
        catch (IOException e){e.printStackTrace();}

        try (FileWriter writer = new FileWriter(path, true)){

            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
