package LessonsJava.lambdaExpressionsTest.LambdaFunctions;

import java.util.function.BiFunction;

public class Starter {
    public static void main(String[] args) {
        Starter s = new Starter();
        PersonLambda p = new PersonLambda();
        s.processHospital(p, 4, (g, d) -> 0.8*8 * g * d);
        s.processAddition(p, 8.5, (g, h) -> 2.2 * g * h);
    }
public void processHospital(PersonLambda p, Integer days, BiFunction<Double, Integer, Double> pH){
        Double sum = (pH.apply(p.getGrade(), days));
}

    public void processAddition(PersonLambda p, Double hours, BiFunction<Double, Double, Double> pH){
        Double sum = (pH.apply(p.getGrade(), hours));
    }
}


