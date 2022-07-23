package LessonsJava.Vol_1_Basics.lambdaExpr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WRLLambda {
    public List<String> readerText(String path){
        List<String>list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = null;
            while((line = br.readLine()) != null){
                list.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    return list;}
}
