package ApplicationReZerV.ErdrPlus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriterReaderEPlus {

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

        //System.out.printf("файл %s прочитан", path1.getFileName());
        //System.out.println();
        return list;} //читаем с заданого пути

    public void writerTxt(String path, List<String> list) throws IOException {
        if(!(Files.exists(Path.of(path))))
            Files.createFile(Path.of(path));

        try(PrintWriter printWriter = new PrintWriter(new PrintWriter(path))){
            for(int i = 0; i < list.size(); i++)
                printWriter.println(list.get(i));
        } catch (IOException ex){ex.printStackTrace();}
        Path path1 = Paths.get(path);

        System.out.printf("The result is written to %s", path1.getFileName());

    } // записываем в заданый файл

    public void showList (List<String> list){
        for(Object s: list)
            System.out.println(s);
    }
}
