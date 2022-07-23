package LessonsJava.AbstractInterfaceOther.Figura;

public class Circle extends Figure {

    int radius = 3;

    @Override
    public void Perimeter() {
        System.out.println("Perimeter of circle is " + 2 * Math.PI * radius );
    }

    public Circle(int countSide, int radius) {
        super(countSide);
        this.radius = radius;
    }

    @Override
    public void Area() {
        System.out.println("Area perimeter of circle is " + Math.PI * radius * radius );
    }
}
