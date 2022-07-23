package LessonsJava.EqualsToStringWrapperClass;

public class Test3 {
    void abc(int i) {
        System.out.println("int");
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(Long i) {
        System.out.println("Long");
    }

    void def(Object o) {
        System.out.println("Object");

    }

    void def(String s) {
        System.out.println("String");
    }

    void ghi(int a, int b) {
        System.out.println("Hello 1");
    }

    void ghi(long a, long b) {
        System.out.println("Hello 2");
    }

    void ghi(Integer a, Integer b) {
        System.out.println("Hello 3");
    }

    void ghi(int... a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void main(String[] args) {
        var t = new Test3();
        t.def((new StringBuilder("Str")));
        t.ghi(1, 2, 5, 8, 9);

    }
}
