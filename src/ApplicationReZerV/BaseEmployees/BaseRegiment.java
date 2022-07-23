package ApplicationReZerV.BaseEmployees;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaseRegiment {
    public static void main(String[] args) throws IOException {
        List<String> listBase = new ArrayList<>();
        List<String> listBaseSort = new ArrayList<>();
        List<String> listBaseQuerry = new ArrayList<>();
        List<String> listComparison = new ArrayList<>();
        WriteReaderBB rb = new WriteReaderBB();
        rb.readerTxt(); //считываем инф из файла с спискром работников
        SeparationL sl = new SeparationL(rb.getListBase());

        rb.setListBaseSort(sl.completeBaseEmployees()); //разделяем его на категории

        rb.readerTxt(rb.pathQuerryList); //передаем список запроса из текстового файла

        sl.setListQuerry(rb.getListQuerry());
        sl.comparisonList(); //передаем общий список для сравнения
        sl.compareTwoList(); //сравниваем два списка


        //for(String s: listComparison) System.out.println(s);
        //rb.writerTxt();//пишем результат в файл
        //sl.writeCount();
    }


}
