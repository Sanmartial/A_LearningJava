package ApplicationReZerV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReaderConsol {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
        String name;
        name = reader.readLine();
        System.out.println(name);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
