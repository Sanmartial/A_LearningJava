package ApplicationReZerV.Call102;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMethodC102 {
    public static void main(String[] args) throws IOException {
        String pathCall102 = "D:\\Test\\Call102\\ADMINPRAKTIKA.txt";
        String pathResult = "D:\\Test\\Call102\\Result.txt";

        List<String> listCall102 = new ArrayList<>();
        List<String> listResult = new ArrayList<>();

        WriteReaderC102 c102 = new WriteReaderC102();
        SeparationC102 SC102 = new SeparationC102();

        listCall102 = c102.readerTxt(pathCall102);

        listResult =SC102.String1(listCall102);

        c102.writerTxt(pathResult, listResult);
        ///c102.showList(listCall102);
    }
}
