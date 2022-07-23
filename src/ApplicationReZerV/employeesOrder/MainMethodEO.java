package ApplicationReZerV.employeesOrder;

import ApplicationReZerV.CommonMethods.CommonMethods;


import java.io.IOException;
import java.util.List;

public class MainMethodEO {
    public static void main(String[] args) throws IOException {
        //String pathList ="E:\\xx.txt";
        String pathList = "\\\\Глоба-пк\\мои документы\\УДАЛИТЬ\\xx.txt";
        //String pathList = "D:\\Test\\EmployeesOrder\\xx.txt";


        SeparateEO sEO = new SeparateEO();
        List<String> listEmployees = CommonMethods.readerListEmployee(pathList);

        sEO.setListEmployees(listEmployees);
        sEO.createString();


//        for (int i = 0; i < listEmployees.size(); i++) {
//            System.out.println(listEmployees.get(i));
//        }
    }
}
