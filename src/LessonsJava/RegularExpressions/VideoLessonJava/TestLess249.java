package LessonsJava.RegularExpressions.VideoLessonJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestLess249 {
    public static void main(String[] args) {
        String lineStr = "підполковник поліції ГЛОБА Роман Миколайович (0036371), помічник начальника штабу\n" +
                "старший лейтенант поліції АТАМАНЧУК Володимир Володимирович (0036432), інспектор штабу\n" +
                "капітан поліції КОНДРАТЮК Віктор Михайлович (0036416), старший інспектор штабу\n";
        String lineStr1 = "старший сержант поліції МАКСАКОВ Сергій Олексійович (0036614), помічник чергового чергової частини штабу";
        String lineCall102 = "33\t21.01.2022 12:35\tІНШІ ЗЛОЧИНИ ПРОТИ ВЛАСНОСТІ (id події 85034158)\tДАРНИЦЬКЕ УП\tРЕЗУС-115 ППОП д/н 3169 ДАРНИЦЬКЕ УП\tЧЧ\t12:38\t4945,7\t\t(4152 хв.)\t( хв.)\t12:47\t4945,7 м.";

        String patternForRank = "[(старший )? А-яі]* поліції";
        String patternForSFName = "(поліції) ([А-ЯІЇї]+) ([А-яіІЇї]+) ([А-яіІЇї]+)"; //нужнотолько указывать номер групы фамилия -1, имя 2, отчество - 3
        String patternForPosition = "([0-9\\),\\(]+) ([А-яі\\sЇї]+)";

//        Pattern pattern = Pattern.compile("Set([Value]+)?");
//        //Pattern pattern = Pattern.compile("\\b[1-9][0-9]{2,4}\\b");
//        Matcher matcher = pattern.matcher("that </head> Set or SetValue clear color 9998 colqur <h3> colrer <title> 125  23259");
//
//  while(matcher.find()){
//      System.out.println("index " + matcher.start() + " | " + matcher.group() + " |");
//  }

        Pattern pattern1 = Pattern.compile("([0-9]+)\\t([0-9\\.]+)\\s([0-9:]+)\\t([\\D]+)");
                Matcher matcher1 = pattern1.matcher(lineCall102);
                //matches:  'Stew' at 0-4, 'Pasta' at 5-10, 'Twinkies' at 11-19
        //'Stew Pasta Twinkies'
        while(matcher1.find())
        System.out.println(matcher1.start() + " " + matcher1.group());
}
}