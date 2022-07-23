package LessonsJava.AbstractInterfaceOther.Figura;

public abstract class Figure {
    int countSide = 0;
    public abstract void Perimeter();

    public Figure(int countSide) {
        this.countSide = countSide;
    }

    public abstract void Area();
}
