package LessonsJava.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamParallel {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        for(int i = 0; i < 10000000; i++){
            list.add(new Random().nextDouble(200));
        }
        long time1 = System.currentTimeMillis();
        double sumResult = list.stream().reduce((ak, el) -> ak-el).get();
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1 + " mc " + sumResult );
        System.out.println("1 thread complete");
        time1 = System.currentTimeMillis();
        double sumResult1 = list.parallelStream().reduce((ak, el) -> ak-el).get();
        time2 = System.currentTimeMillis();
        System.out.println(time2-time1 + " mc " + sumResult1 );

    }
}
