package ApplicationReZerV.RZ_Day.NoSpace;

import ApplicationReZerV.RZ_Day.WriteReaderRZ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NoSpaceString {
    public static void main(String[] args) {
        List<String> listEmployees = new ArrayList<>();
        List<String> listEmployeesResult = new ArrayList<>();
        String pathString = "D:\\Test\\RZ_DAY\\NoSpace\\listEmployees.txt";

        WriteReaderRZ writeReaderRZ = new WriteReaderRZ();
        listEmployees = writeReaderRZ.readerTxt(pathString);

        NoSpace ns = new NoSpace();

        for(int i = 0; i < listEmployees.size(); i++ ){
            listEmployeesResult.add(ns.NoSpace(listEmployees.get(i)));
        }

        try {writeReaderRZ.writerTxt(pathString, listEmployeesResult);
        } catch (IOException e) {e.printStackTrace();}
    }
}

class NoSpace{
    public String NoSpace(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int index = sb.indexOf(" ");
        if(index == 0){
            //System.out.println(sb.substring(1) + " 1");
            return sb.substring(1);
        }
        else{
            //System.out.println(sb.substring(1) + " 0");
            return sb.substring(0);}
    }
}
