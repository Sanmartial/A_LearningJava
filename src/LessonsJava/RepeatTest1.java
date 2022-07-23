package LessonsJava;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatTest1 {
    public static void main(String[] args) {
        List<Something> list = new ArrayList<>();
        list.add(new Something("Pen", "red", 1.4, 27));
        list.add(new Something("Chair", "black", 7.4, 270));
        list.add(new Something("Computer", "grey", 5.4, 1027));
        list.add(new Something("Table", "brown", 8.4, 458));
        list.add(new Something("Lamp", "yellow", 0.4, 17));
        list.add(new Something("Closet", "white", 9.4, 727));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getColor());
        }

        //Collections.sort(list);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getColor() + " " + list.get(i).getAmount());
        }

        System.out.println("STREAMS\n");

       //List<Something> list2 =  list.stream().filter(x -> x.getAmount() > 300).collect(Collectors.toList());
        List<Something> list2 =  list.stream().sorted((x,y) -> x.getAmount()-y.getAmount()).collect(Collectors.toList());

       list2.stream().forEach(System.out::println);
//
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i).getName() + " " + list2.get(i).getColor());
//        }


    }
}

class Something {
    private String name;
    private String color;
    private double part;
    private int amount;

    public Something(String name, String color, double part, int amount) {
        this.name = name;
        this.color = color;
        this.part = part;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Something{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", part=" + part +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Something something = (Something) o;
        return Double.compare(something.part, part) == 0 && amount == something.amount && Objects.equals(name, something.name) && Objects.equals(color, something.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, part, amount);
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

    public double getPart() {
        return part;
    }

    public void setPart(double part) {
        this.part = part;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

//    @Override
//    public int compareTo(Something o) {
//        return this.getAmount() - o.getAmount();
//    }
}

