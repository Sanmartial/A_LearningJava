package LessonsJava.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Ball> list = new ArrayList<>();
        list.add(new Ball(105, "tipo", "yellow", 25));
        list.add(new Ball(123, "taco", "red", 23));
        list.add(new Ball(98, "rico", "silver", 12));
        list.add(new Ball(117, "wart", "blue", 33));
        list.add(new Ball(158, "veibo", "yellow", 19));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list, new IdBall());
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class Ball {
    private int ID;
    private String name;
    private String color;
    private int price;

    public Ball(int ID, String name, String color, int price) {
        this.ID = ID;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class IdBall implements Comparator<Ball> {
    @Override
    public int compare(Ball o1, Ball o2) {
        if(o1.getID()==o2.getID())
            return 0;
        else if(o1.getID()<o2.getID())
            return -1;
        else
            return 1;
    }
}