package ApplicationReZerV.RZ_Day;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMethodRZ {
    public static void main(String[] args) throws IOException {
        String pathTabelDay = "D:\\Test\\RZ_DAY\\tabelDay.txt";; // путь к списку rz
        String pathHvResult = "D:\\Test\\RZ_DAY\\hvResult.txt"; // путь для записи результата
        String pathNResult = "D:\\Test\\RZ_DAY\\nResult.txt"; // путь для записи результата
        String pathRzResult = "D:\\Test\\RZ_DAY\\rzResult.txt"; // путь для записи результата
        String pathvpResult = "D:\\Test\\RZ_DAY\\vpResult.txt"; // путь для записи результата

        String rz = "РЗ";
        String vp = "ВП";
        String hv = "ХВ";
        String n = "Н";

        //LIST
        List<String> listTabelDay = new ArrayList<>();
        List<String> listHvResult = new ArrayList<>();
        List<String> listNResult = new ArrayList<>();
        List<String> listRzResult = new ArrayList<>();
        List<String> listVpResult = new ArrayList<>();

        WriteReaderRZ wRZ = new WriteReaderRZ();
        SeparationRZ sRZ = new SeparationRZ();

        listTabelDay = wRZ.readerTxt(pathTabelDay);

        listRzResult = sRZ.stringResult(listTabelDay, rz);
        listHvResult = sRZ.stringResult(listTabelDay, hv);
        listNResult = sRZ.stringResult(listTabelDay, n);
        listVpResult = sRZ.stringResult(listTabelDay, vp);

        //wRZ.showList(listTabelDay);

        wRZ.writerTxt(pathRzResult, listRzResult);
        wRZ.writerTxt(pathHvResult, listHvResult);
        wRZ.writerTxt(pathNResult, listNResult);
        wRZ.writerTxt(pathvpResult, listVpResult);



    }
}
