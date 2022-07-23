package LessonsJava.lambdaExpressionsTest.LambdaJava2;

import ApplicationReZerV.CommonMethods.CommonMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StudentInfoJ2 {
    void testStudent(List<StudentJ2> list, Predicate<StudentJ2> pr){
        for (StudentJ2 c :
                list) {
            if(pr.test(c))
                System.out.println(c);

        }
    }
}
class TestLEJ2{
    public static void main(String[] args) {
        ArrayList<StudentJ2> list = new ArrayList<>();
        StudentJ2 st1 = new StudentJ2("Ivan", 'm', 22, 3, 8.3);
        StudentJ2 st2 = new StudentJ2("Roman", 'm', 27, 4, 6.3);
        StudentJ2 st3 = new StudentJ2("Stepan", 'm', 21, 1, 7.5);
        StudentJ2 st4 = new StudentJ2("Vladimir", 'm', 24, 2, 5.9);
        StudentJ2 st5 = new StudentJ2("Maria", 'f', 26, 5, 9.5);
        StudentJ2 st6 = new StudentJ2("Ilona", 'f', 29, 1, 6.5);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);

        //list.removeIf(x -> x.getCourse() == 2);

        Collections.sort(list, (s1, s2) -> s1.getAge() - s2.getAge());

      new CommonMethods().showList(list);

        System.out.println("=========================");

        StudentInfoJ2 info = new StudentInfoJ2();
        //info.testStudent(list, new CheckOverAge());
        System.out.println("------------------");
        Predicate<StudentJ2> p1 = x -> x.getCourse() > 2;
        Predicate<StudentJ2> p2 = x -> x.getSex() == 'f';

        info.testStudent(list, p1.negate());
    }
}
//interface StudentCheck{
//    boolean check(StudentJ2 st);
//}

//class CheckOverAge implements StudentCheck{
//    @Override
//    public boolean check(StudentJ2 st) {
//        return st.getAge() > 25;
//    }
//}