package LessonsJava.lambdaExpressionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaFromVideo {
    public static void main(String[] args) {
//        File file = new File("D:\\Мои документы");
//        File [] Ffile = file.listFiles((f) -> f.isDirectory());
//        for(File files: Ffile)
//        System.out.println(files.getName());

        List<String> list = new ArrayList<>();

        for(int i = 0; i < 10; i++)
            list.add(String.format("%02d", i));

        Collections.sort(list, (t1, t2) ->-t2.compareTo(t1));

        for(String s: list)
            System.out.println(s);

    }

}
