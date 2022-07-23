package ApplicationReZerV.LotteryChance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecourceLottery {

    private final String userName = "bestuser";
    private final String password = "bestuser";
    private final String connectionUrl = "jdbc:mysql://localhost:3306/my_db";
            // ?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
    //private final  String truncNumeric = "TRUNCATE TABLE my_db.numeric";
    //private final  String createNumeric = "create table IF NOT EXISTS my_db.numeric (num1 int, num2 int, num3 int, num4 int, num5 int, num6 int)";
    //private final  String truncResult = "TRUNCATE TABLE my_db.resultloto";
    //private final  String createResult = "create table IF NOT EXISTS my_db.resultloto (num1 int, num2 int, num3 int, num4 int, num5 int, num6 int)";
    public List<Integer> dropNumeric(){
        List<Integer> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\Test\\lottery\\dropBall.txt"))){
            String line = null;
            while ((line = br.readLine()) != null){
                list.add(valueInt(line));
            }

        }
        catch (IOException s){s.printStackTrace();}
        return list;}

    public void truncDataBase(String trunc, String create ){
        try(Connection connection = DriverManager.getConnection(connectionUrl, userName, password)){
            Statement statement = connection.createStatement();
            connection.setAutoCommit(false);
            statement.executeUpdate(trunc);
            statement.executeUpdate(create);
            //System.out.println("table created!!!");
            connection.commit();
        }
        catch (SQLException s){ s.printStackTrace(); }
    }

    public void  writeToDataBaseNumeric(List<Numeric> list){
        int count = 0;
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password)){
            Statement statement = connection.createStatement();
            String insertLine = "INSERT INTO my_db.numeric (num1, num2, num3, num4, num5, num6) VALUES (";
            StringBuilder sb = new StringBuilder();
            connection.setAutoCommit(false);
            for (int i = 0; i < list.size(); i++) {
                count++;
                sb.append(insertLine).append("'").append(list.get(i).getNumber1()).append("', '").append(list.get(i).getNumber2()).append("', '")
                        .append(list.get(i).getNumber3()).append("', '").append(list.get(i).getNumber4()).append("', '")
                        .append(list.get(i).getNumber5()).append("', '").append(list.get(i).getNumber6()).append("')");
                //System.out.println(sb.substring(0));
                statement.executeUpdate(sb.substring(0));
                sb.delete(0, sb.length());
            }
            connection.commit();
            System.out.printf("written to data base %d rows\n", count);
        }
        catch (SQLException s){
            s.printStackTrace();
        }
    }

    public void writerToDataBaseResult(List<String> listString, String connectionUrl, String userName, String password){
        if(!listString.isEmpty()) {
            List<Numeric> list = new ArrayList<>();
            for (int i = 0; i < listString.size(); i++) {
                //System.out.println(listString.get(i).length());
                list.add(addNumericResult(listString.get(i)));
            }
            String insertLine = "INSERT INTO my_db.resultloto (num1, num2, num3, num4, num5, num6) VALUES (";
            StringBuilder sb = new StringBuilder();

            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password)) {
                Statement statement = connection.createStatement();
                connection.setAutoCommit(false);
                for (int i = 0; i < list.size(); i++) {
                    sb.append(insertLine).append("'").append(list.get(i).getNumber1()).append("', '").append(list.get(i).getNumber2()).append("', '")
                            .append(list.get(i).getNumber3()).append("', '").append(list.get(i).getNumber4()).append("', '")
                            .append(list.get(i).getNumber5()).append("', '").append(list.get(i).getNumber6()).append("')");
                    System.out.println(sb.substring(0));
                    statement.executeUpdate(sb.substring(0));
                    sb.delete(0, sb.length());
                }
                connection.commit();
            } catch (SQLException s) {
                s.printStackTrace();
            }
        }
        else
            System.out.println("file is empty");
    }

    private Numeric addNumericResult(String s) {
        StringBuilder sb = new StringBuilder();
        Numeric numeric = new Numeric();
        int[] tab = new int[6];

        tab = arrayTab(s);
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
        String line1, line2, line3, line4, line5, line6;
        line1 = s.substring(tab[0], tab[1]).trim();
        line2 = s.substring(tab[1], tab[2]).trim();
        line3 = s.substring(tab[2], tab[3]).trim();
        line4 = s.substring(tab[3], tab[4]).trim();
        line5 = s.substring(tab[4], tab[5]).trim();
        line6 = s.substring(tab[5], s.length()).trim();

        num1 = valueInt(line1);
        num2 = valueInt(line2);
        num3 = valueInt(line3);
        num4 = valueInt(line4);
        num5 = valueInt(line5);
        num6 = valueInt(line6);
        numeric = new Numeric(num1,num2,num3,num4,num5,num6);
        return numeric;}

    private int valueInt(String line1) {
        return Integer.valueOf(line1);
    }

    private int[] arrayTab (String s){
        char ch[] = s.toCharArray();
        System.out.println();
        int chN[] = new int[6];
        int j = 1;
        chN[0] = 0;

        for(int i =0; i < ch.length; i++, j++){
            if(ch[i]=='\t' || ch[i]==' ')
                chN[j] = i;
            else j--;
        }

        return  chN;} //определяет индекс пробела(табуляции)

    public List<String> readerTxtResult(String path){
        List<String>list = new ArrayList<>();
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;

            while((line = br.readLine()) != null){
                list.add(line);
                count++;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Path path1 = Paths.get(path);

        System.out.printf("reading of %s finished. Read %d lines\n", path1.getFileName(), count);
        return list; }

    public List<Numeric> readerDataBaseNumeric() {
        List<Numeric> list = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(connectionUrl, userName, password)){
            Statement statement = connection.createStatement();
            String stringQuerry = "select * from my_db.numeric";
            ResultSet resultSet = statement.executeQuery(stringQuerry);
            while (resultSet.next()){
                list.add(new Numeric(resultSet.getInt("num1"),resultSet.getInt("num2"),
                        resultSet.getInt("num3"),resultSet.getInt("num4"),
                        resultSet.getInt("num5"),resultSet.getInt("num6")));
            }
        }
        catch (SQLException s) {
            s.printStackTrace();
        }
        return list;}

}
