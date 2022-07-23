package LessonsJava.EqualsToStringWrapperClass;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        Long l = 50L;
        int a  = list.get(0); //unboxing
        System.out.println(a);
        Integer b = new Integer(10);
        int c = b;

        String s1 = "50";
        String s2 = "true";
        String s3 = "50";

        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
        double d1 = Double.valueOf(s3);
        Byte b10 = new Byte((byte)5);
        System.out.println(b10.equals(d1));
    }

}
