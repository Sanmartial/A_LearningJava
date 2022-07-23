package LessonsJava.patternsProgramming;

import ApplicationReZerV.RZ_Day.WriteReaderRZ;
import org.apache.poi.examples.hslf.ApacheconEU08;

import java.util.*;

public class qq{
    public static void main(String[] args) {
        WriteReaderRZ wr = new WriteReaderRZ();
        List<String> listA = new ArrayList<>();
        List<String> listL = new LinkedList<>();

        listA.add("Hello");
        listA.add("Hello!");
        listA.add("Hello!!");
        listA.add("Hello!!!");

        listL.add("Hello");
        listL.add("Hello!");
        listL.add("Hello!!");
        listL.add("Hello!!!");

        Iterator iterator = listA.listIterator();
        int ii;
        while(iterator.hasNext()) {
            System.out.println(iterator.next().hashCode());
                   }
    }
}

class Roman{

}