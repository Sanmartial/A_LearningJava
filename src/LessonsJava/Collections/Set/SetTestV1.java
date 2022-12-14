package LessonsJava.Collections.Set;

import java.util.*;

public class SetTestV1 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        long TotalTime = 0;
        try(Scanner in = new Scanner(System.in)){
            while(!in.hasNext("#"))
            {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                TotalTime += callTime;
            }

        }

        Iterator<String> iter = words.iterator();
        for(int i = 0; i < 20 && iter.hasNext(); i++)
            System.out.println(iter.next());
        System.out.println(". . . .");
        System.out.println(words.size() + " distinct words. " + TotalTime + " milliseconds");
    }
}
