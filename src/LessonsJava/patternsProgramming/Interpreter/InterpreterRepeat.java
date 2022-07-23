package LessonsJava.patternsProgramming.Interpreter;

import LessonsJava.lambdaExpressionsTest.LambdaFunctions.Starter;

import java.util.Stack;

public class InterpreterRepeat {
    public static void main(String[] args) {
    String expressoin = "125+337+658+965-123";
    Expression evaluator = new Evaluate(expressoin);
        System.out.println(evaluator.interpreter(evaluator));
    }
}

interface Expression{
    int interpreter(Expression context);
}

class Number implements Expression{
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpreter(Expression context) {
        return number;
    }
}

class Plus implements Expression{
    Expression exprLeft;
    Expression exprRight;

    public Plus(Expression exprLeft, Expression exprRight) {
        this.exprLeft = exprLeft;
        this.exprRight = exprRight;
    }

    @Override
    public int interpreter(Expression context) {
        return exprLeft.interpreter(context) + exprRight.interpreter(context);
    }
}

class Minus extends Plus{
    public Minus(Expression exprLeft, Expression exprRight) {
        super(exprLeft, exprRight);
    }

    @Override
    public int interpreter(Expression context) {
        return exprLeft.interpreter(context) - exprRight.interpreter(context);
    }
}

class Evaluate implements Expression{
    Expression evaluate;

    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        String expressionRever = new StringBuilder(expression).reverse().toString();
        for(String s: expressionRever.split("\\D")){
            expressions.push(new Number(Integer.parseInt(s)));
        }

        for(String s: expression.split("\\d")){
            if(s.equals("+")){
                expressions.push(new Plus(expressions.pop(), expressions.pop()));
            }
            else if(s.equals("-")){
                expressions.push(new Minus(expressions.pop(), expressions.pop()));
            }
        }
        evaluate = expressions.pop();
    }

    @Override
    public int interpreter(Expression context) {
        return evaluate.interpreter(context);
    }
}