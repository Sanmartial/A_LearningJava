package LessonsJava.patternsProgramming.Bridge;

public class BridgeTest2 {
    public static void main(String[] args) {
        BlackCOlor black = new BlackCOlor();
    Rectangle rectangle = new Rectangle(black);

    rectangle.draw();

    }
}

abstract class Shape{
    protected Color color;

    public abstract void draw();
    public Shape(Color color){
        this.color = color;
    }
}

class Rectangle extends Shape{

    public Rectangle(Color color){
        super(color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        color.fillColor();
    }

}

class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}

interface Color {
    void fillColor();
}

class BlackCOlor implements Color{
    @Override
    public void fillColor() {
       System.out.println("Filling in black color");
    }


}

class GreenColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Filling in green color");
    }
}

class RedColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Filling in red color");
    }
}