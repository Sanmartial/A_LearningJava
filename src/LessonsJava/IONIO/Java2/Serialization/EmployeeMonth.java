package LessonsJava.IONIO.Java2.Serialization;

import java.io.OutputStream;
import java.io.Serializable;

public class EmployeeMonth implements Serializable {
    private String name;
    private transient double salary;
    private int age;
    CarForEmployee car;

    public EmployeeMonth(String name, double salary, int age, CarForEmployee car) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "EmployeeMonth{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
