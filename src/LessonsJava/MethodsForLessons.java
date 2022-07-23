package LessonsJava;

import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.List;

public class MethodsForLessons {

    public static List<String> getListStr(String[] line){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            list.add(line[i]);
        }

    return list;}

    public static List<Integer> getListInt(int[] line){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            list.add(line[i]);
        }

        return list;}
}
