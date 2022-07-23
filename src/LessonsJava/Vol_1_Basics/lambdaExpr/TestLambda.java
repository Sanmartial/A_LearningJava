package LessonsJava.Vol_1_Basics.lambdaExpr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestLambda {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = forMMM::test;

        String xx = "Hello";
        int y = 15;
        if(biPredicate.test(xx,y))
            System.out.println("Your values is equals");
        else
            System.out.println("Your values are not equals");

        String path = "D:\\Test\\gmail.txt";
    List<String>list = new ArrayList<>();
    SelectionText st = (String s) ->{

        if(s.contains("GlobaRoMan".toLowerCase())) return true;
        else
          return false;};
    WRLLambda wrl = new WRLLambda();
    list = wrl.readerText(path);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(st.text(list.get(i))){
            System.out.println(list.get(i));
            count++;}
        }
        if(count == 0)
            System.out.println("Text was not found");
        else
            System.out.println("Was found " + count + " coincidences");

        Comparator<String> stringComparator = (String o1, String o2) -> {
            if(o1.length() > o2.length()) return 1;
            else
                return 0;
        };

        Consumer<Integer> con = x ->
            System.out.println(x);
        con.accept((int) 'H');
        count = 0;
        Supplier<String> request = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter request");
            String liner = scanner.nextLine();

            return new String(liner);
        };
        String requestLine = request.get();
        Predicate<String> predicate = line -> line.contains(requestLine);
        for (int i = 0; i < list.size(); i++) {
            if(predicate.test(list.get(i)))
                //System.out.println(list.get(i));
            count++;
            }
        if(count == 0)
            System.out.println("Text was not found");
        else
            System.out.println("Was found " + count + " coincidences");
        }

    private static boolean test(String x, Integer y) {
        if(x.length()== y) return true;
        else
            return false;
    }
}

