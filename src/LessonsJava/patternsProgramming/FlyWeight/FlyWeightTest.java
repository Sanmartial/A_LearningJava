package LessonsJava.patternsProgramming.FlyWeight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyWeightTest {
    public static void main(String[] args) {
        FlyWeightMercedes flyWeightMercedes = new FlyWeightMercedes();
        Mercedes mercedes = flyWeightMercedes.getMercedes("red", "ML");
        Mercedes mercedes1 = flyWeightMercedes.getMercedes("black", "Bench");
        Mercedes mercedes2 = flyWeightMercedes.getMercedes("red,", "sportcoupe");

        flyWeightMercedes.getMap();


    }

    static class Mercedes {
        String color;
        String nameCar;

        public Mercedes(String nameCar) {
            this.nameCar = nameCar;
        }

        @Override
        public String toString() {
            return "Mercedes{" +
                    "color='" + color + '\'' +
                    ", nameCar='" + nameCar + '\'' +
                    '}';
        }
    }

    static class FlyWeightMercedes {
        Map<String, Mercedes> map = new HashMap<>();

        Mercedes getMercedes(String color, String name) {
            Mercedes mercedes = map.get(color);

            if (mercedes == null) {
                mercedes = new Mercedes(name);
                mercedes.color = color;
                map.put(color, mercedes);
            }
            return mercedes;
        }

        public void getMap() {
            for (Map.Entry entry :
                    map.entrySet()) {
                System.out.println(entry);
            }

        }
    }
}