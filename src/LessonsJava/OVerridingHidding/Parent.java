package LessonsJava.OVerridingHidding;

public class Parent {
int method(){
    return 1;
}
}

class Child extends Parent {
    //@Override
    int method() {
        return 2;
    }
}

class Test1 {
    public static void main(String[] args) {
        Parent par = new Parent();
        Parent chi = new Child();

        System.out.println(par.method());
        System.out.println(chi.method());
    }
}