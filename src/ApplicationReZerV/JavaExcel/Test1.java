package ApplicationReZerV.JavaExcel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
    public static void main (String[] args) throws IOException {

        try{
            FileOutputStream fos = new FileOutputStream("D:\\Test\\myXCL.xlsx");
            FileInputStream fis = new FileInputStream("D:\\Test\\myXCL.xlsx");

            Workbook wb = new XSSFWorkbook("D:\\Test\\myXCL.xlsx");
            Sheet sheet = wb.createSheet("mySheet");


            //wb.write(fos);
            fos.close();

        }
        catch (Exception n){
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, n);
        }

    }
    }

