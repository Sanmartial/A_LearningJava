package ApplicationReZerV.ListPolk_SQL;

import ApplicationReZerV.Employees.Policeman;
import ApplicationReZerV.ListPolk_SQL.DataBaseList_Polk.ProcessDataBase;
import ApplicationReZerV.ListPolk_SQL.SeparateList.SeparateListPolk;

import java.io.IOException;
import java.util.List;

public class GeneralMethod {
    public static void main(String[] args) throws IOException {
        ProcessDataBase pdb = new ProcessDataBase();
        //dbmethods.dataBAse("select * from my_db.list_polk");


        //create base employees polk

        SeparateListPolk slp = new SeparateListPolk();
        List<Policeman>listPoliceman = slp.separateList(); //read txt file///separate one///create list with example class Policeman
        pdb.fullDB(listPoliceman);//заполняем базу данных



    }
}
