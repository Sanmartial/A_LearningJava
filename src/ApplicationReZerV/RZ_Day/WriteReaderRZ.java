package ApplicationReZerV.RZ_Day;

import org.apache.poi.ss.formula.functions.T;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WriteReaderRZ {

    //Methods
    public List<String> readerTxt(String path){
        List<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                list.add(line);
            }
        }catch (IOException ex){ex.printStackTrace();}

        Path path1 = Paths.get(path);

        System.out.printf("reading of %s finished", path1.getFileName());
        System.out.println();
        return list;} //читаем с заданого пути

    public void writerTxt(String path, List<String> list) throws IOException {
        Date data = new Date();
        SimpleDateFormat sDate = new SimpleDateFormat("dd.MM.YYYY HH.mm");
        if(!(Files.exists(Path.of(path))))
            Files.createFile(Path.of(path));
int count = 0;
        try(PrintWriter printWriter = new PrintWriter(new PrintWriter(path))){
            for(int i = 0; i < list.size(); i++) {
                printWriter.println(list.get(i));
                count++;
            }
        } catch (IOException ex){ex.printStackTrace();}
        Path path1 = Paths.get(path);
        System.out.print(sDate.format(data));
        System.out.printf(" file %s written.\nWritten %d rows", path1.getFileName(), count);
        System.out.println();
    } // записываем в заданый файл

    public void showList (List<String> list){
        for(Object s: list)
            System.out.println(s);
    }

    public void  showListT (List<?> list){

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
