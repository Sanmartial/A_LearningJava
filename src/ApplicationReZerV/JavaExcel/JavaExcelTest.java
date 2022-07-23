package ApplicationReZerV.JavaExcel;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExcelTest {
    public static void main(String[] args) throws IOException {

        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("mySheet");

        try(FileOutputStream fos = new FileOutputStream("D:\\Test\\myXCL.xls")) {
            wb.write(fos);
            fos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
