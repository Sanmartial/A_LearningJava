package ApplicationReZerV.ErdrPlus.ERDRPlusSOLID;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteInf {
    public List<String> read(String s) {
        List<String> list = new ArrayList<>();
        try(BufferedReader bf = new BufferedReader(new FileReader(s))) {
            String line;

            while((line = bf.readLine()) != null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
   return list; }

    public void write(String s, StorageMemory storageMemory) {
        try(PrintWriter print = new PrintWriter(new FileWriter(s))) {
            for (int i = 0; i < storageMemory.getListResult().size(); i++) {
                print.println(storageMemory.getListResult().get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
