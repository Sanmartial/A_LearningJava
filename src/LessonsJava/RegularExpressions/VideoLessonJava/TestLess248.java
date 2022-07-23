package LessonsJava.RegularExpressions.VideoLessonJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestLess248 {
    public static void main(String[] args) {

        String matcherStr = "\\W+]";
        CharSequence patternStr = "ПОВІДОМЛЕННЯ ПРО ВИБУХ,ПІДПАЛ,ЗАМІНУВАННЯ, ІНШІ ЗАГРОЗИ ЖИТТЮ ЛЮДЕЙ (id події 84944672)";
        Pattern pattern = Pattern.compile(matcherStr);

        Matcher matcher = pattern.matcher(patternStr);

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
