package LessonsJava.IONIO.ReflectionTest;

import java.lang.reflect.Field;

public class StarterReflection {
    public static void main(String[] args) throws Exception {
        Class class1 = Class.forName("LessonsJava.IONIO.ReflectionTest.SecondReflection");
        SecondReflection fr = (SecondReflection) class1.newInstance();

        Field field = class1.getSuperclass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(fr, "Roman");

        Field field1 = class1.getDeclaredField("name1");
        field1.setAccessible(true);
        field1.set(fr, "Globa");

        System.out.println(fr.getName());
        System.out.println(fr.getName1());
    }
}
