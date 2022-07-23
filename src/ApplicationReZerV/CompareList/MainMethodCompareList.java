package ApplicationReZerV.CompareList;

import java.util.ArrayList;
import java.util.List;

public class MainMethodCompareList {
    public static void main(String[] args) {
        String pathListOne = "D:\\Test\\CompareList\\listOne.txt";
        String pathListTwo = "D:\\Test\\CompareList\\listTwo.txt";
        String pathResult = "D:\\Test\\CompareList\\result.txt";

        WriteAndReaderCompareList writeReader = new WriteAndReaderCompareList();
        CompareList compareList = new CompareList();
        List<String> listOne = writeReader.readerList(pathListOne);
        List<String> listTwo = writeReader.readerList(pathListTwo);
        List<String> listResult = compareList.compareList(listOne, listTwo);

        System.out.println("listOne size - " + listOne.size());
        System.out.println("result size - " + listResult.size());

        writeReader.wroteListResult(listResult, pathResult);
        //writeReader.showList(listResult);
    }
}
