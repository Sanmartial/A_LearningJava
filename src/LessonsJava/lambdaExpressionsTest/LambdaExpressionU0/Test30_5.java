package LessonsJava.lambdaExpressionsTest.LambdaExpressionU0;

public class Test30_5 {


    static void def(testtest tt){
        System.out.println(tt.abc("Hello"));
    }

    public static void main(String[] args) {
        def(x -> x.indexOf('l'));
    }
}

interface  testtest{
    int abc(String s);
}