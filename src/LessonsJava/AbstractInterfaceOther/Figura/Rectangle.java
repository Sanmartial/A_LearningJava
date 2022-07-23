package LessonsJava.AbstractInterfaceOther.Figura;

public class Rectangle extends Figure {
    int countSide = 4;
    int sizeSide1 = 8;
    int sideSize2 = 11;

    @Override
    public void Perimeter() {
        System.out.println("Perimeter is " + 2 * (sizeSide1 + sideSize2));
    }

    public Rectangle(int countSide, int countSide1) {
        super(countSide);
        this.countSide = countSide1;
    }

    @Override
    public void Area() {
        System.out.println("Ares of perimeter is " + sizeSide1 * sideSize2);
    }
}
