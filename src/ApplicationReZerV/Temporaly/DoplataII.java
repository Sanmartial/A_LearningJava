package ApplicationReZerV.Temporaly;

import ApplicationReZerV.RZ_Day.WriteReaderRZ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DoplataII {
    public static void main(String[] args) throws IOException {

    String pathCategoty = "D:\\Test\\Temporaly\\category.txt";
    String pathCoeficient = "D:\\Test\\Temporaly\\coeficient.txt";
    String pathResult = "D:\\Test\\Temporaly\\rr.txt";

    WriteReaderRZ wr = new WriteReaderRZ();

    List<String> listCategory = wr.readerTxt(pathCategoty);
    List<String> listCoeficient = wr.readerTxt(pathCoeficient);
    List<String> listResult = new ArrayList<>();

        for (int i = 0; i < listCategory.size(); i++) {
            listResult.add("5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5"+"\t" + "5");
            listResult.add("0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6"
                    + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6"
                    + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6" + "\t" + "0,6");
            listResult.add(listCategory.get(i));
            listResult.add(listCoeficient.get(i));
            listResult.add(" ");
            listResult.add(" ");
        }

        wr.showList(listResult);
        wr.writerTxt(pathResult, listResult);


}
}
