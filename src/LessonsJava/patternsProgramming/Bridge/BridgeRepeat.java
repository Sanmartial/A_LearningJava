package LessonsJava.patternsProgramming.Bridge;

public class BridgeRepeat {
    public static void main(String[] args) {
    BlackColorTable black = new BlackColorTable();
    TriangleTable tri = new TriangleTable(black);

    tri.stay();

        System.out.println(tri);
    }
}

abstract class Table{
    protected ColorTable colorTable;

    public Table(ColorTable colorTable) {
        this.colorTable = colorTable;
    }

    public abstract void stay();
}

class TriangleTable extends Table{

    public TriangleTable(ColorTable colorTable) {
        super(colorTable);
    }

    @Override
    public void stay() {
        System.out.println("Table has triangle form");
        colorTable.fillColor();
    }
}

class RectangleTable extends Table{

    public RectangleTable(ColorTable colorTable) {
        super(colorTable);
    }

    @Override
    public void stay() {
        System.out.println("Table has Rectangle form");
    }
}

interface ColorTable{
    void fillColor();
}

class BlackColorTable implements ColorTable{
    @Override
    public void fillColor() {
        System.out.println("Table painted black color");
    }
}
class GreenColorTable implements ColorTable{
    @Override
    public void fillColor() {
        System.out.println("Table painted green color");
    }
}
