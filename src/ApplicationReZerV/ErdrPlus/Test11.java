package ApplicationReZerV.ErdrPlus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) throws SQLException {
        String user = "bestuser";
        String password = "bestuser";
        String connectUrl = "jdbc:mysql://localhost:3306/my_db";
//        List<Students> list = new ArrayList<>();
//        list.add(new Students("Roman", "Globa", "IT"));
//        list.add(new Students("Anjela", "Morales", "Philosophy"));
//        list.add(new Students("Robert", "Patison", "Art"));
//        list.add(new Students("Ilona", "Roberts", "Chimical"));
//        list.add(new Students("Ilon", "Mask", "IT"));
//        list.add(new Students("Barak", "Obama", "MBA"));
//        list.add(new Students("Nikolay", "Romanov", "MBA"));
//        list.add(new Students("Sofiia", "Globa", "Veterinary"));
//
//        try(Connection connection = DriverManager.getConnection(connectUrl, user, password)){
//            System.out.println("we are connected");
//
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("DROP TABLE TEST");
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS TEST (ID mediumint not null auto_increment, NAME VARCHAR (20), SURNAME VARCHAR (20), DEPARTMENT VARCHAR (10), PRIMARY KEY (ID))");
//
//            String s = "insert into TEST (name, surname, department) values(";
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < list.size(); i++){
//                sb.append(s).append("'").append(list.get(i).getName()).append("', '").append(list.get(i).getSurname())
//                        .append("', '").append(list.get(i).getDepartment()).append("')");
//                //System.out.println(sb.substring(0));
//                statement.executeUpdate(sb.substring(0));
//                sb.delete(0, sb.length());
//            }
//
//            //statement.executeUpdate("ALTER TABLE TEST drop column course");
//
//            ResultSet resultSet = statement.executeQuery("select * from TEST");
//
//            while(resultSet.next()){
//                System.out.println(resultSet.getString("name") + " " + resultSet.getString("surname"));
//            }
//            String d = "kk";
//            ResultSet resultSet1 = statement.executeQuery("select name from test where name like  '%f%'");
//            while(resultSet1.next()) {
//                d = resultSet1.getString("name");
//                System.out.println(d);
//            }
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//        }
    }
}
