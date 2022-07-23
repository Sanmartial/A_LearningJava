package LessonsJava.RegularExpressions.Java2;

import java.util.Arrays;
import java.util.regex.*;

public class RegExTest1 {
    public static void main(String[] args) {
        String text = "Globa Roman, Ukraine, Kyiv, Lobanovskiy str., 152, flat 613, email: globaroman@gmail.com, postcode 03039, phone number: +380674248534;" +
                "Geraschenko Yarolava, Ukraine, Kyiv, Lomonosov str., 56, flat 76, email: geraschenkoyaros@gmail.com, postcode 03169, phone number: +380504433480";

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        //Pattern pattern = Pattern.compile("\\b[\\w+\\s\\w+]");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
           System.out.println(matcher.group());
        }

        String [] arr = text.split(" ");
        for(String s: arr)
            System.out.println(s);

        String idBank = "41440843137607480722622";
        String patt = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";

        Pattern pattern1 = Pattern.compile(patt);
        Matcher matcher1 = pattern1.matcher(idBank);

        String idBank1 = matcher1.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(idBank1);
    }
}
