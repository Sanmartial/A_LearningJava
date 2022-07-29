package ApplicationReZerV.ListPolk_SQL.DataBaseList_Polk;

import java.sql.*;

public class DataBaseMethods {
    final private String userName = "bestuser";
    final private String password = "bestuser";
    final private String connectURL = "jdbc:mysql://localhost:3306/my_db";
//    public void queryDataBAse(String query){
//        try(Connection  connection = DriverManager.getConnection(connectURL, userName, password)){
//            System.out.println("CONNECTED!");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while(resultSet.next()){
//                System.out.println(resultSet.getString("Surname") + " " + resultSet.getString("firstname") + " " + resultSet.getString("patronymic") + " " + resultSet.getString("tokenId"));
//            }
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//        }
//    }

    public void truncateDataBAse(){
        try(Connection  connection = DriverManager.getConnection(connectURL, userName, password)){
            String sqlQuery = "truncate table my_db.list_polk";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlQuery);
            System.out.println("truncate table list_polk");
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
            //System.out.println(sb1.substring(0));
            statement.executeUpdate(sb1.substring(0));
        }
        catch (SQLException e){ e.printStackTrace();}
    }
}
