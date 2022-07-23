package LessonsJava.Vol_1_Basics.abstractMethods;

public class BuildFigure extends Figure{
    private int amountSide = 0;
    private int lengthSide1 = 0;
    private int lengthSide2 = 0;


    public BuildFigure(String nameFigure, int amountSide, int lengthSide1, int lengthSide2) {
        super(nameFigure);
        this.amountSide = amountSide;
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
    }

    @Override
    public void squareFigure() {

        System.out.println("square "  + nameFigure + " is 0000");
    }

    @Override
    public void lengthFigure() {
        System.out.println("length of sides "  + nameFigure + " is 00000");
    }
}
