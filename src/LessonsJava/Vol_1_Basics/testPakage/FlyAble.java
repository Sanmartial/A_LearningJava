package LessonsJava.Vol_1_Basics.testPakage;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface FlyAble extends Comparable{
    public String nameBird = "Groom";

    public void canFly();

    default String nameBB(){
        return nameBird;
    }

    static String lineBB(){return nameBird + " it is the name of the skill";}

    private static void showI(List<Object> list){
        for(Object s:list)
            System.out.println(s);
    }

    default void showIT(List<Object> list){
        showI(list);
    }
}
