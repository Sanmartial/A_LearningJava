package ApplicationReZerV.ErdrPlus;

import java.sql.*;
import java.util.List;

public class DataBaseErdrPlus {

    public void writeDataBAse(List<String> listOne, List<String> listTwo, List<String> listResult) throws SQLException {
        final String userName = "bestuser";
        final String password = "bestuser";
        final String connectionUrl = "jdbc:mysql://localhost:3306/my_db";

        try(Connection connection = DriverManager.getConnection(connectionUrl,userName,password)){
            System.out.println("\nWe are connect!");
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP TABLE ERDR");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS ERDR (listOne varchar(21), result varchar(60))");
            //statement.executeUpdate("insert into erdr (id, listOne, listTwo, result) VALUES(1,'?','?','?')");

            connection.setAutoCommit(false);

            String s = "insert into erdr (listOne, result) VALUES(";
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < listResult.size(); i++) {
                sb.append(s).append("'").append(listOne.get(i)).append("', '").append(listResult.get(i)).append("')");
                //System.out.println(sb.substring(0));
                statement.executeUpdate(sb.substring(0));
                sb.delete(0,sb.length());
            }
            connection.commit();



        }

    }
}
