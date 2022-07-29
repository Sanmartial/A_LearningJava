package ApplicationReZerV.ListPolk_SQL.DataBaseList_Polk;

import ApplicationReZerV.Employees.Policeman;

import java.util.List;

public class ProcessDataBase {

    public void fullDB (List<Policeman> list){
        DataBaseMethods DBMethods = new DataBaseMethods();
        DBMethods.truncateDataBAse();//очищаем таблицу в базе данных
        for (int i = 0; i < list.size(); i++) {
            DBMethods.insertDataBase(list.get(i).getTokenID(), list.get(i).getPosition(), list.get(i).getRank(), list.get(i).getSurname(),
            list.get(i).getFirstName(), list.get(i).getPatronymic(), list.get(i).getShortName(), list.get(i).getUnit());
        }

    }
}
