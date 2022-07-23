package LessonsJava.JDBC;

import ApplicationReZerV.CommonMethods.CommonMethods;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateDataBase {
    public static void main(String[] args) throws ClassNotFoundException {
       String userName = "bestuser";
        //String userName = "hr";
        String password = "bestuser";
        //String password = "hr";
        String connectUrl = "jdbc:mysql://localhost:3306/my_db";
        //String connectUrl = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        //Class.forName("com.mysql.jdbc.Driver");
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        try (Connection connection = DriverManager.getConnection(connectUrl, userName, password)){
            System.out.println("We are connected");
            Statement statement = connection.createStatement();
            //statement.executeUpdate("CREATE TABLE EMPLOYEES()");
            ResultSet resultSet;

//            resultSet = statement.executeQuery("SELECT count(*) FROM sakila.actor where length(first_name) < 4");
//            resultSet.next();
//            System.out.println(resultSet.getInt(1));
            resultSet = statement.executeQuery("SELECT DISTINCT DISTRICT FROM MY_DB.CALL102 order by DISTRICT");
            List<String>list = new ArrayList<>();
            //resultSet = statement.executeQuery("SELECT * FROM MY_DB.CALL102");
            while(resultSet.next()){
                //System.out.println(resultSet.getString("DISTRICT") + " " + resultSet.getString("PATROL"));
                list.add(resultSet.getString("DISTRICT"));
            }
            //Collections.sort(list);
            CommonMethods.writeList(list, "D:\\file1.txt");

        } catch (SQLException | IOException throwables) {
            throwables.printStackTrace();
        }

    }
}
