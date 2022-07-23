package LessonsJava.Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "male", "Roman", 46, 190, 5, 3000);
        Employee emp2 = new Employee(115, "female", "Maria", 27, 168, 4, 2500);
        Employee emp3 = new Employee(109, "male", "Serg", 32, 175, 3, 1890);
        Employee emp4 = new Employee(122, "male", "Boris", 19, 185, 1, 2200);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println("before sort \n" + list);
        System.out.println("after sort\n");
        Collections.sort(list);
        System.out.println(list);

        }
    }
