package LessonsJava.patternsProgramming;



public class Test1PP {
    public static void main(String[] args) throws IllegalAccessException {
        new Test1PP().go("BAD1", new Create());
        new Test1PP().go("BAD2", new Update());


    }
    private void go(String data, Operation operation) throws IllegalAccessException {
        operation.action(data);
    }
}

class Create implements Operation{
    @Override
    public void action(String data) {
        System.out.println("Создано, data: "+ data);
    }
}

class Update implements Operation{
    @Override
    public void action(String data) {
        System.out.println("create, data: "+ data);
    }
}
