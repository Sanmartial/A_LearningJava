package ApplicationReZerV.CompareList;

import org.apache.poi.ss.formula.functions.T;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReaderCompareList {

    public List<String> readerList(String path){
        List<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while((line = br.readLine()) != null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return list;}

    public void wroteListResult(List<String> list, String path){
        int count = 0;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (int i = 0; i < list.size(); i++) {
                count++;
                bw.write(list.get(i));
                bw.write("\n");
            }
            System.out.println("write in list " + count + " row");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showList(List<String> list){
        for (String t :
                list) {
            System.out.println(t);
        }
    }
}
