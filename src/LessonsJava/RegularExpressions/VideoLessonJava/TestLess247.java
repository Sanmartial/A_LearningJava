package LessonsJava.RegularExpressions.VideoLessonJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//буквальные выражения
public class TestLess247 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\Q.j\\E");
        Matcher matcher = pattern.matcher("123456789globaroman@gmail.comdjdgd.jljgdjkdljdljdl");

        while(matcher.find()){
            System.out.println("start " + matcher.start() + " " + matcher.group() + " ");
        }
    }
}
