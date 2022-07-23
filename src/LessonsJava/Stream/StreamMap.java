package LessonsJava.Stream;

import ApplicationReZerV.CommonMethods.CommonMethods;
import LessonsJava.MethodsForLessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String>list = MethodsForLessons.getListStr(new String[] {"Roman", "Hello", "Java", "Ivan", "New-York"});
        List<String>list1 = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            list1.add(i, String.valueOf(list.get(i).length()));
        }
        Collections.sort(list1);
        CommonMethods.showList(list1);

        System.out.println("%%%%%%%%%%%%%%%");
        List<Integer> list2 = list.stream().map(x -> x.length()).collect(Collectors.toList());

        CommonMethods.showList(list2);



    }
}
