package LessonsJava.RegularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        String s = "D2113sd0124";
        String s1 = "[a-zA-Z0-9]+(-|\\+)?\\d+";
        String r = "Hello!!!";
        String r1 = "[^a-c]*";
        System.out.println(r.matches(r1));

        String url = "http://www.globaroman.com";
        String mT = "http://.+\\.(com|ua|ru)";
        System.out.println(url.matches(mT));

        String []arrSt = url.split("\\."); //разделяет по указаному рег.выражению
        System.out.println(Arrays.toString(arrSt));

        String mobStr = url.replaceAll("\\.", " ");
        System.out.println(mobStr);

       String mailText = "sandeepslg678@gmail.com:bengdubi noramfuller@gmail.com:remember bangtoyib2@gmail.com:bangsatt";
           // String mailText =" My email is globaroman@gmail.com";

        System.out.println(mailText.matches("\\w+@gmail\\.com"));

        Pattern pattern = Pattern.compile("com:(\\w+)");//"(\\w+)@gmail\\.com"
        Matcher matcher = pattern.matcher(mailText);

        while(matcher.find()){
            System.out.println(matcher.group(1));
        }



    }
}
