package LessonsJava.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableRepeat {
    public static void main(String[] args) {
        List<PhoneCompare> list = new ArrayList<>();
        list.add(new PhoneCompare("Nokia", 450, 101258, "red"));
        list.add(new PhoneCompare("Samsung", 750, 101015, "black"));
        list.add(new PhoneCompare("LG", 555, 1013598, "grey"));
        list.add(new PhoneCompare("IPhone", 1259, 101457, "red"));
        list.add(new PhoneCompare("Xiaomi", 370, 101005, "silver"));
        list.add(new PhoneCompare("Huawei", 390, 100985, "red"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        System.out.println("AFTER SORTED\n");
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}

class PhoneCompare implements Comparable<PhoneCompare>{
    private String name;
    private int price;
    private int ID;
    private String color;

    public PhoneCompare(String name, int price, int ID, String color) {
        this.name = name;
        this.price = price;
        this.ID = ID;
        this.color = color;
    }

    @Override
    public String toString() {
        return "PhoneCompare{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ID=" + ID +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(PhoneCompare anotherPh) {
//        if(this.price == anotherPh.price )
//            return  1;
//        else if(this.price < anotherPh.price)
//            return -1;
//        else
//        return 0;

       // return this.ID- anotherPh.ID;

        return this.name.compareTo(anotherPh.name);

    }


}
