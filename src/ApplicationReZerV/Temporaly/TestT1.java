package ApplicationReZerV.Temporaly;

import java.util.Random;
import java.util.function.Predicate;

public class TestT1 {
    public static void main(String[] args) {
        Predicate<Integer>predicate = (x) -> x>15 && x < 35;
        int f = 2;
        Random random = new Random();
        for (int i = 1; i < 100; i++) {
            System.out.println(predicate.test( new Random().nextInt(i*3)));
        }
    }
}

