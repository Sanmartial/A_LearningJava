package LessonsJava.RegularExpressions.Java2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest2 {
    public static void main(String[] args) {
        String s1 = "ABCDOP ABCDE ABCFABCGABCH";

//        Pattern pattern = Pattern.compile("[ABCD]");
//        Matcher matcher = pattern.matcher(s1);
//
//        while(matcher.find()){
//            System.out.println("position " + matcher.start() + " " + matcher.group());
//        }
        Pattern pattern = Pattern.compile("ABC[C-F]OP");
        Matcher matcher = pattern.matcher(s1);

        while(matcher.find()){
            System.out.println("position " + matcher.start() + " " + matcher.group());
        }
    }
}
