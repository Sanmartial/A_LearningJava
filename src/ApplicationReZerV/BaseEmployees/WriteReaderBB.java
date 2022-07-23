package ApplicationReZerV.BaseEmployees;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WriteReaderBB {

    private List<String> listBase = new ArrayList<>();
    private List<String> listBaseSort = new ArrayList<>();
    private List<String> listQuerry = new ArrayList<>();


    private String pathBase = "D:\\Test\\BaseEmpl\\listBaseEmployees.txt";
    private String pathBase1 = "D:\\Test\\BaseEmpl\\ResultBaseEmployees.txt";
    public String pathQuerryList = "D:\\Test\\BaseEmpl\\QuerryList.txt";


    public void readerTxt(){
        try(BufferedReader br = new BufferedReader(new FileReader(pathBase))){
            String line;
            while((line = br.readLine()) != null){
                listBase.add(line);
            }
        }catch (IOException ex){ex.printStackTrace();}
        System.out.println("file read");}

    public void readerTxt(String path){

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                listQuerry.add(line);
            }
        }catch (IOException ex){ex.printStackTrace();}
        System.out.println("file read");
    } //читаем с заданого пути

    public void writerTxt() throws IOException {
        if(!(Files.exists(Path.of(pathBase1))))
            Files.createFile(Path.of(pathBase1));

        try(PrintWriter printWriter = new PrintWriter(new PrintWriter(pathBase1))){
            for(int i = 0; i < listBaseSort.size(); i++)
                printWriter.println(listBaseSort.get(i));
        } catch (IOException ex){ex.printStackTrace();}
        System.out.println("file written");}

    public void writerOther(String path1, String s ) throws IOException {
        if(!(Files.exists(Path.of(path1))))
            Files.createFile(Path.of(path1));

        try(PrintWriter printWriter = new PrintWriter(new PrintWriter(path1))){
            //for(int i = 0; i < listBaseSort.size(); i++)
            printWriter.println(s);
        } catch (IOException ex){ex.printStackTrace();}
        System.out.println("file written");}

    public List<String> getListQuerry() {
        return listQuerry;
    }
    public void setListQuerry(List<String> listQuerry) {
        this.listQuerry = listQuerry;
    }
    public void setListBaseSort(List<String> listBaseSort) {
        this.listBaseSort = listBaseSort;
    }
    public List<String> getListBase() {
        return listBase;
    }
}
