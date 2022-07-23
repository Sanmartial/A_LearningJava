package ApplicationReZerV.JDBCCall102;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainMethodJDBC102 {
    public static void main(String[] args) throws IOException, SQLException {
        String pathCall102 = "D:\\Test\\Call102\\ADMINPRAKTIKA.txt";
        String pathResult = "D:\\Test\\Call102\\Result.txt";

        List<String> listCall102 = new ArrayList<>();
        List<String> listResult = new ArrayList<>();

        WriteReaderJDBC102 c102 = new WriteReaderJDBC102();
        SeparationJDBC102 SC102 = new SeparationJDBC102();

        listCall102 = c102.readerTxt(pathCall102);

        listResult =SC102.String1(listCall102);

        c102.writerTxt(pathResult, listResult);

        for(int i = 0; i < listResult.size(); i++)
            c102.writeTODataBase(SC102.getStringInsert(i));
        ///c102.showList(listCall102);
        System.out.println("DOne!!!");
    }
}
