package LessonsJava.InHeritance;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        Person people[] = new Person[5];
        String [] ff = {"Hello", "Hi", "Bye"};
        people[0] = new Employee("Vlad", 98000, 2005,03,5);
        people[1] = new Employee("Nical", 101000, 2006,2,22);
        people[2] = new Employee("Stepan", 150005, 2001, 3,27);
        people[3] = new Manager("Pavel", 105000, 2004, 10,22, 1000);
        people[4] = new Manager("Pavel", 105000, 2004, 10,22, 1000);

        Manager m1 = new Manager("Pavel", 105000, 2004, 10,22, 1000);
        Manager m2 = new Manager("Pavel", 155000, 2004, 10,22, 1000);
        Manager m3 = new Manager("Pavel", 105000, 2004, 10,29, 1000);


        double a=12, b = 7;
        Student st = new Student("Harold", "Computer");

        String ss = Arrays.toString(ff);
        StringBuilder sb1 = new StringBuilder(ss);
    String sd = sb1.substring(1,6);

        String ss1 = st.getClass().toString();
        System.out.println("ss1 " + ss1);
        StringBuilder sb2 = new StringBuilder(ss1);
        int indPoint = ss1.indexOf('.', 47);
        String ss2 = sb2.substring(indPoint+1, ss1.length());
        System.out.println("ss2 " + ss2);
       var ver = new ArrayList<>();
        ver.add(m1);
        ver.add(m2);

        ver.set(1,  new Manager("Nicol",106000, 2005, 11, 13,  900));
        System.out.println(ver.getClass());

        int a1 = 2;
        Integer a2 = 25;
        Integer a3 = 37;
var al1 = new ArrayList<Integer>();
al1.add(a1);
al1.add(a2);
al1.add(a3);
for(Integer aaa: al1)
    System.out.println(aaa);

       }
}
