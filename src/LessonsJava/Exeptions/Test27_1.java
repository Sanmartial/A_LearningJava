package LessonsJava.Exeptions;

public class Test27_1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}

class Animal {
    int a  = 5;
    static int b = 10;

    void abc() {
        System.out.println("non-static method from class Animal");
    }

    static void def() {
        System.out.println("static method from class Animal");
    }
} //Animal

class Tiger extends Animal {
    int a  = 15;
    static int b = 20;

    void abc() {
        System.out.println("non-static method from class Tiger");
    }

    static void def() {
        System.out.println("static method from class Tiger");
    }
} //Tiger