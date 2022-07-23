package LessonsJava.Vol_1_Basics.abstractMethods;

public abstract class Figure {
    public Figure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public String nameFigure;

    abstract public void squareFigure();
    abstract public void lengthFigure();
}
