package LessonsJava.ReflectionEx;

import java.lang.reflect.Field;

public class ReflectionEx3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class empClass = EmployeeRef.class;
        EmployeeRef emp = new EmployeeRef(111, "Roman", "IT");
        Field field = empClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryV = field.getDouble(emp);
        System.out.println(salaryV);
        field.set(emp, 1234.65);
        System.out.println(emp);
    }
}
