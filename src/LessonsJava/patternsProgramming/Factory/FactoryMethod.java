package LessonsJava.patternsProgramming.Factory;

public class FactoryMethod {
    public static void main(String[] args) {
    SelfMethod selfMethod = SelfMethod.create();
    }
}

class SelfMethod{
    private SelfMethod() {
    }
    public static SelfMethod create(){
        return new SelfMethod();
    }
}
