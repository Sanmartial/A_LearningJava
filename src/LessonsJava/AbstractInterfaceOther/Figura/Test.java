package LessonsJava.AbstractInterfaceOther.Figura;

public class Test {
    public static void main(String[] args) {
        Figure f1 = new Square(4);
        System.out.println(f1.countSide);
        f1.Area();
    }

}
