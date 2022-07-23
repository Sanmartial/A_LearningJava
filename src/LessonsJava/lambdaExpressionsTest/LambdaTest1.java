package LessonsJava.lambdaExpressionsTest;

import java.util.Arrays;

public class LambdaTest1 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Arrays.toString(arr);
        Runner runner = new Runner();
        runner.run(new ExecuteAble() {
            @Override
            public String execute() {
               return "Hello";
            }
        });
         runner.run(()-> "Hello!!!!");
         runner.run(()->"JAVA!!!");
    }
}

interface ExecuteAble {
    String execute();
}

class Runner{
    public void run(ExecuteAble e) {
        System.out.println(e.execute());

    }
}
