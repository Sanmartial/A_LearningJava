package LessonsJava.patternsProgramming.Factory;

public class FactoryMethodRepeat {
    public static void main(String[] args) {
        Table table = Table.create();
    }
}

class Table{
    private Table() {
    }
    public static Table create(){
        return new Table();
    }
}
