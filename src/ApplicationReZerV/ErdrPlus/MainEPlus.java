package ApplicationReZerV.ErdrPlus;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainEPlus {
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        final String pathListOne = "D:\\Test\\ErdrPlus\\listOne.txt";
        final String pathListTwo = "D:\\Test\\ErdrPlus\\listTwo.txt";
        final String pathResult = "D:\\Test\\ErdrPlus\\Result.txt";
        final String pathStatUK = "D:\\Test\\ErdrPlus\\StatUK.txt";

        List<String> listOne = new ArrayList();
        List<String> listTwo = new ArrayList<>();
        List<String> listResult = new ArrayList<>();

        ResourseEPlus resourse = new ResourseEPlus();
        WriterReaderEPlus wrRe = new WriterReaderEPlus();
        CompareErdrPlus compare = new CompareErdrPlus();
        PrepareList prepare = new PrepareList();
        FixList fixList = new FixList();
        DataBaseErdrPlus DB = new DataBaseErdrPlus();

        int choice = resourse.listForChoice();
        if(choice == 1){
            listOne = wrRe.readerTxt(pathListOne);
            listTwo = wrRe.readerTxt(pathListTwo);
            listOne = compare.sortListErdr(listOne);
            listTwo = compare.sortListErdr(listTwo);
            listResult = compare.compareListString(listOne, listTwo);
            wrRe.writerTxt(pathResult, listResult);
            //DB.writeDataBAse(listOne, listTwo, listResult);
        }

        if(choice == 2){
            listOne = wrRe.readerTxt(pathListOne);
            listResult = prepare.sortListErdr(listOne);
            Thread.sleep(2000);
            wrRe.writerTxt(pathResult, listResult);
        }

        if(choice == 3){
            listOne = wrRe.readerTxt(pathListOne);
            listResult = prepare.sortListErdrPlusZero(listOne);
            Thread.sleep(2000);
            wrRe.writerTxt(pathResult, listResult);
        }

        if(choice == 4){
            listOne = wrRe.readerTxt(pathStatUK);
            listResult = fixList.ListProcess(listOne);
            wrRe.writerTxt(pathResult, listResult);
        }
    }
}
