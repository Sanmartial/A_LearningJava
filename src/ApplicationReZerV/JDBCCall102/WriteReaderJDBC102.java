package ApplicationReZerV.JDBCCall102;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WriteReaderJDBC102 {


    //Methods
    public List<String> readerTxt(String path){
        List<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                list.add(line);
            }
        }catch (IOException ex){ex.printStackTrace();}

        Path path1 = Paths.get(path);

        System.out.printf("reading of %s finished", path1.getFileName());
        System.out.println();
        return list;} //читаем с заданого пути

    public void writerTxt(String path, List<String> list) throws IOException {
        if(!(Files.exists(Path.of(path))))
            Files.createFile(Path.of(path));

        try(PrintWriter printWriter = new PrintWriter(new PrintWriter(path))){
            for(int i = 0; i < list.size(); i++)
                printWriter.println(list.get(i));
        } catch (IOException ex){ex.printStackTrace();}
        Path path1 = Paths.get(path);
        System.out.printf("file %s written", path1.getFileName());
        System.out.println();
    } // записываем в заданый файл

    public void showList (List<String> list){
        for(Object s: list)
            System.out.println(s);
    }

    public void writeTODataBase(String selectString) throws SQLException {
    final String userName = "bestuser";
    final String password = "bestuser";
    final String connectionUrl = "jdbc:mysql://localhost:3306/my_db";

        try(
    Connection connection = DriverManager.getConnection(connectionUrl,userName,password)){
        Statement statement = connection.createStatement();

        connection.setAutoCommit(false);
        String s = "insert into my_db.call102 (id, DATA102, event, district, patrol, job_type, directed, distance, confirmation," +
                "arrived, done, cancel, min_distance, time_1, time_2, time) VALUES(";
        StringBuilder sb = new StringBuilder();
        sb.append(s).append(selectString);
        //System.out.println(sb.substring(0));
        statement.executeUpdate(sb.substring(0));
        //sb.delete(0,sb.length());
        connection.commit();
    }

}

}
