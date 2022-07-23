package LessonsJava.Vol_1_Basics.abstractMethods;

public class TestAbstract {
    public static void main(String[] args) {
        BuildFigure quadrangle = new BuildFigure("quadrangle", 4, 10, 14);
        quadrangle.lengthFigure();
        quadrangle.squareFigure();
    }
}
