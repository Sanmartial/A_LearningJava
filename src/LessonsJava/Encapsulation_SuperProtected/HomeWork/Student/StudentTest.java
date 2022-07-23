package LessonsJava.Encapsulation_SuperProtected.HomeWork.Student;

public class StudentTest {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Roman");
        Student st1 = new Student(sb1, 2, 4);
        st1.ShowTest();
    }

}
