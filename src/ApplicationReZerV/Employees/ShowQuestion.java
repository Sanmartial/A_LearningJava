package ApplicationReZerV.Employees;

import java.util.Scanner;
import java.util.function.Supplier;

public class ShowQuestion {
    private Scanner scanner = new Scanner(System.in);
    public int questionStart(){
        System.out.println("What will you want to do next?");
        System.out.println("1 - create list by form\n2 - compare two lists");
        int answer = scanner.nextInt();
        while(answer > 2 || answer < 1){
            System.out.println("It was wrong answer. Make a choice again");
            answer = scanner.nextInt();
        }
    return answer;}

    public int nextAfterOne(){
        int answer = 0;
        System.out.println("What it should be?");
        System.out.println("1 - create a list by regular form\n" +
                "2 - create a list like a DAVALNIY\n" +
                "3 - create a list like a RODOVIY\n" +
                "4 - \n" +
                "5 - ");
        answer = scanner.nextInt();
        while(answer < 1 || answer > 5){
            System.out.println("It was wrong answer. Make a choice again");
            answer = scanner.nextInt();
        }

    return answer;}
}

