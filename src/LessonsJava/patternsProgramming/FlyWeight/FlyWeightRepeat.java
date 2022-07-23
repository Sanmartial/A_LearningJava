package LessonsJava.patternsProgramming.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightRepeat {
    public static void main(String[] args) {
        FlyWeightRep fly = new FlyWeightRep();
        Bottle bottle = fly.getBottle("red", "bear", 500);
        Bottle bottle1 = fly.getBottle("black", "Mineral water", 500);
        Bottle bottle2 = fly.getBottle("green", "Soda", 1500);
        Bottle bottle3 = fly.getBottle("grey", "bearBeer", 500);
        Bottle bottle4 = fly.getBottle("pink", "Whisky", 1000);
        Bottle bottle5 = fly.getBottle("red", "Shampanie", 750);
        Bottle bottle6 = fly.getBottle("black", "CocaCola", 1500);

        fly.getMap();


    }
}

class Bottle{
    String name;
    String color;
    int volume;

    public Bottle(String name, int volume) {
        this.name = name;
        this.volume =volume;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                '}';
    }
}

class FlyWeightRep{
    Map<String, Bottle> map = new HashMap<>();

   Bottle getBottle(String color, String name, int volume){
       Bottle bottle = map.get(color);

       if(bottle == null){
           bottle = new Bottle(name, volume);
           bottle.color = color;
           map.put(color, bottle);
       }
   return bottle;}

    public void getMap(){
        for (Map.Entry entry :
                map.entrySet()) {
            System.out.println(entry);
        }
    }
}