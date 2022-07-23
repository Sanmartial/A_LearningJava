package LessonsJava.lambdaExpressionsTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LambdaComparatorTest {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list = ReaderText();

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                if(t1.length() > t2.length())
                    return 1;
                else if (t1.length() < t2.length())
                        return -1;
                else
                return 0;
            }
        });

        list.sort((t1, t2) -> {
            if(t1.length() > t2.length())
                    return 1;
                else if (t1.length() < t2.length())
                        return -1;
                else
                return 0;
        });
        Collections.sort(list);
        for (String s: list)
            System.out.println(s);
    }

public static List<String> ReaderText(){
        List<String>list = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader("D:\\Test\\gmail1.txt"))){
        String line, sss;
        while((line = br.readLine()) != null) {
            sss = RegularSort(line);
            if(!(sss.equals("not found")))
            list.add(sss);
        }
    }
    catch (IOException e){e.printStackTrace(System.out);}
    return list;
    }

    public static String RegularSort(String s){
        Pattern pattern = Pattern.compile(":(roman\\w+)");
        Matcher matcher = pattern.matcher(s);
        String ss = "not found";
        while ( matcher.find()){
            ss = matcher.group(1);
        }
    return  ss;}
}

