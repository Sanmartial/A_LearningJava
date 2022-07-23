package ApplicationReZerV.CommonMethods;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonMethods {

    public static void showList(List<?> list) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }

        list.forEach(str -> System.out.println(str));
    } //выводит на экран любой список

    public static void writeList(List<?> list, String path) throws IOException {
        if (!(Files.exists(Path.of(path))))
            Files.createFile(Path.of(path));
        int row = 0;
        Date date = new Date();
        Path pathGet = Paths.get(path);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY HH.mm");
        try (PrintWriter print = new PrintWriter(new FileWriter(path))) {
            for (int i = 0; i < list.size(); i++) {
                print.println(list.get(i));
                row++;
            }
            System.out.print(sdf.format(date) + " ");
            System.out.println("into " + pathGet.getFileName() + " written " + row + " rows");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }// запись в указаный файл любого списка

    public static List<String> readerListEmployee(String path) throws IOException {
        if (!(Files.exists(Path.of(path))))
            Files.createFile(Path.of(path));
        int row = 0;
        List<String> list = new ArrayList<>();
        Date date = new Date();
        SimpleDateFormat sfd = new SimpleDateFormat("dd.MM.YYYY HH:mm");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Path pathGet = Paths.get(path);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() > 65) {
                    list.add(line);
                    row++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Read and added to list " + sfd.format(date) + " " + row + " rows\n");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        return list;
    }//читает из файла (только для списка работников) возвращает list<String>

    public static List<String> readerListAll(String path) throws IOException {
        if (!(Files.exists(Path.of(path))))
            Files.createFile(Path.of(path));
        int row = 0;
        List<String> list = new ArrayList<>();
        Date date = new Date();
        SimpleDateFormat sfd = new SimpleDateFormat("dd.MM.YYYY hh:MM");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Path pathGet = Paths.get(path);
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Read and added to list " + sfd.format(date) + " " + row + " rows\t");
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - ");
        return list;
    }//читает из файла. возвращает list<String>

    public static String getData(String formatDate){
        Date date = new Date();
        SimpleDateFormat sfd = new SimpleDateFormat(formatDate);
        return sfd.format(date);
    } //врзвращает дату в заданом формате
}
