package LessonsJava.patternsProgramming.Filter;

import ApplicationReZerV.RZ_Day.WriteReaderRZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FilterRepeat {
    public static void main(String[] args) {
Pencil pencil = new Pencil("Cohinor", "Silver", 10, 0.5);
        Pencil pencil1 = new Pencil("Cohinor", "black", 12, 0.6);
        Pencil pencil2 = new Pencil("Cohinor", "green", 11, 0.45);
        Pencil pencil3 = new Pencil("Cohinor", "red", 8, 0.55);
        Pencil pencil4 = new Pencil("Cohinor", "black", 10, 0.7);
        Pencil pencil5 = new Pencil("Cohinor", "pink", 13, 0.85);
        Pencil pencil6 = new Pencil("Cohinor", "Silver", 7, 0.35);

        List<Pencil>list = new ArrayList<>();
        List<Pencil>list1 = new ArrayList<>();
        list.add(pencil);
        list.add(pencil1);
        list.add(pencil3);
        list.add(pencil2);
        list.add(pencil4);
        list.add(pencil5);
        list.add(pencil6);

        LengthFilterPen length = new LengthFilterPen();
        ColorFilter colorFilter = new ColorFilter();
        AndFilterPen andFilterPen = new AndFilterPen(new LengthFilterPen(), new ColorFilter());
        OrFilterPen orFilterPen = new OrFilterPen(new ColorFilter(), new LengthFilterPen());

        list1 = length.filter(list);

        for (Pencil pen :
                list1) {
            System.out.println(pen.toString());
        }
        System.out.println("_______________________________________");
        list1 = colorFilter.filter(list);

        for (Pencil pen :
                list1) {
            System.out.println(pen.toString());
        }
        System.out.println("#########################################");
        list1 = andFilterPen.filter(list);
        for (Pencil pen :
                list1) {
            System.out.println(pen.toString());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        list1 = orFilterPen.filter(list);
        for (Pencil pen :
                list1) {
            System.out.println(pen.toString());
        }
    }
    }

    class Pencil{
    private String name;
    private String color;
    private int length;
    private double price;

        public Pencil(String name, String color, int length, double price) {
            this.name = name;
            this.color = color;
            this.length = length;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Pencil{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", length=" + length +
                    ", price=" + price +
                    '}';
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

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    interface FilterPencil{
    List<Pencil> filter(List<Pencil>list);
    }

    class LengthFilterPen implements FilterPencil{
    List<Pencil> listResult = new ArrayList<>();

        @Override
        public List<Pencil> filter(List<Pencil> list) {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getLength() > 10){
                    listResult.add(list.get(i));
                }
            }
            return listResult;
        }
}

    class ColorFilter implements FilterPencil{
    List<Pencil> listResult = new ArrayList<>();
    @Override
    public List<Pencil> filter(List<Pencil> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getColor().toLowerCase(Locale.ROOT).equals("pink") || list.get(i).getColor().toLowerCase(Locale.ROOT).equals("silver")){
                listResult.add(list.get(i));
            }
        }
        return listResult;
    }
}

    class AndFilterPen implements FilterPencil{
    FilterPencil filterPencilOne;
    FilterPencil filterPencilTwo;

    public AndFilterPen(FilterPencil filterPencilOne, FilterPencil filterPencilTwo) {
        this.filterPencilOne = filterPencilOne;
        this.filterPencilTwo = filterPencilTwo;
    }

    @Override
    public List<Pencil> filter(List<Pencil> list) {
        List<Pencil> list1 = filterPencilOne.filter(list);
        return filterPencilTwo.filter(list1);
    }
}

class OrFilterPen implements FilterPencil {
    FilterPencil filterPencilOne;
    FilterPencil filterPencilTwo;

    public OrFilterPen(FilterPencil filterPencilOne, FilterPencil filterPencilTwo) {
        this.filterPencilOne = filterPencilOne;
        this.filterPencilTwo = filterPencilTwo;
    }

    @Override
    public List<Pencil> filter(List<Pencil> list) {
        List<Pencil> list1 = filterPencilOne.filter(list);
        List<Pencil> list2 = filterPencilTwo.filter(list);

        for (Pencil pen :
                list2) {
            if (!list.contains(pen)) {
                list1.add(pen);
            }
        }
    return list1;}
}