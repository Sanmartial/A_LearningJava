package ApplicationReZerV.ListPolk_SQL.DataBaseList_Polk;

import java.sql.*;

public class DataBaseMethods {
    private String userName = "bestuser";
    private String password = "bestuser";
    private String connectURL = "jdbc:mysql://localhost:3306/my_db";
    public void dataBAse(String query){
        try(Connection  connection = DriverManager.getConnection(connectURL, userName, password)){
            System.out.println("CONNECTED!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                System.out.println(resultSet.getString("Surname") + " " + resultSet.getString("firstname") + " " + resultSet.getString("patronymic") + " " + resultSet.getString("tokenId"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void insertDataBase(String tokenId, String position, String rankId, String surname, String firstname, String patronymic, String shortName, String unit){
        try(Connection connection = DriverManager.getConnection(connectURL, userName, password)){
            Statement statement = connection.createStatement();
            StringBuilder sb1 = new StringBuilder();
            sb1.append("insert into my_db.list_polk values(").append("'" + tokenId +"'").append(",").append("'" + position +"'").append(", ").append("'" + rankId +"'").append(", ").append("'" + surname +"'").
                    append(", ").append("'" + firstname +"'").append(", ").append("'" + patronymic +"'").append(", ").append("'" + shortName +"'").append(", ").append("'" + unit +"'").append(")");
            System.out.println(sb1.substring(0));
            statement.executeUpdate(sb1.substring(0));
        }
        catch (SQLException e){ e.printStackTrace();}
    }
}
