package LessonsJava.Collections.MAp;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        StringBuilder line = new StringBuilder();
        int r = 0;
        char ch = 65;

        for (int i = 0; i < 1000; i++) {

            for (int j = 0; j < 35; j++) {
                for (int k = 0; k < 1; k++) {
                    while((r = new Random().nextInt(122)) > 0){
                        //System.out.print(r + " ");
                        if(Character.isLetterOrDigit((char) r))
                            ch = (char) r;
                        continue;}
                }
                line.append((char)ch);
            }
            map1.put(i, line.substring(0));
            line.delete(0, line.length());
        }

        for (Map.Entry<Integer, String> entry:
         map1.entrySet()){

            System.out.println(entry.getKey() + " " + entry.getValue());

        }


    }
}
