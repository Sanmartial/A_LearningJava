package LessonsJava.patternsProgramming.Facade;

import ApplicationReZerV.RZ_Day.WriteReaderRZ;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FasadeTest {
    public static void main(String[] args) {
        FileReaderFacade fileReaderFacade = new FileReaderFacade();
        List<String> list = fileReaderFacade.read("D:\\Test\\gmail1.txt");
        for (String s :
                list) {
            System.out.println(s);
        }

    }
}

class FileReaderFacade{

    public List<String> read(String path){
        List<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return list;}
}