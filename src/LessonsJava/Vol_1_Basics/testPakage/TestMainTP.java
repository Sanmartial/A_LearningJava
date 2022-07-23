package LessonsJava.Vol_1_Basics.testPakage;

import java.util.ArrayList;
import java.util.List;

public class TestMainTP {
    public static void main(String[] args) {
        Bird bird = new Crow("crow", true, "black");
        System.out.println();
        bird.canFly();
        bird.voiceB();
        System.out.println(FlyAble.nameBird + "!!!!");
        FlyAble fly = new Crow("Sparrow", true, "Yellow");
        fly.canFly();
        System.out.println(bird.nameBB()) ;
        System.out.println(FlyAble.lineBB());
        List<Object> list = new ArrayList<>();
        list.add(2);
        list.add("55 Hello");
        bird.showIT(list);

        FlyAble flyAble;

    }
}
