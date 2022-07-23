package LessonsJava.AbstractInterfaceOther.Figura;

public class Square extends Figure {
    int countSide = 4;
    int sizeSide = 10;
    @Override
    public void Perimeter() {
        System.out.println("Perimeter square is " + sizeSide * 4);
    }

    public Square(int countSide) {
        super(countSide);
        this.countSide = countSide;
    }

    @Override
    public void Area() {
        System.out.println("Ares square is " + sizeSide * sizeSide);

    }
}
