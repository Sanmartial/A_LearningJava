package ApplicationReZerV.ListPolk_SQL;

import ApplicationReZerV.ListPolk_SQL.DataBaseList_Polk.DataBaseMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GeneralMethod {
    public static void main(String[] args) {
        DataBaseMethods dbmethods = new DataBaseMethods();
        //dbmethods.dataBAse("select * from my_db.list_polk");
        dbmethods.insertDataBase("0036386", "заступник командира полку", "підполковник поліції", "САЛІЄНКО", "Михайло", "Борисович ", "Салієнко М.Б.", "штаб");
    }
}
