package ApplicationReZerV.Temporaly;

import ApplicationReZerV.CommonMethods.CommonMethods;

import ApplicationReZerV.RZ_Day.WriteReaderRZ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlusSixRow {
    public static void main(String[] args) throws IOException {
        String pathListEmp = "D:\\Test\\Temporaly\\listEmp.txt";
        String pahtResult = "D:\\Test\\Temporaly\\rr.txt";


        List<String> listEmp = CommonMethods.readerListAll(pathListEmp);
        List<String> listResult = new ArrayList<>();

        System.out.println(listEmp.size());

        for (int i = 0; i < listEmp.size(); i++) {
            listResult.add(listEmp.get(i));
            for (int j = 0; j < 5; j++) {
                listResult.add("");
            }
        }


        CommonMethods.writeList(listResult, pahtResult);


    }
}
