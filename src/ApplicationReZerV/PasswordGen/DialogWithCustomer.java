package ApplicationReZerV.PasswordGen;

import java.util.Scanner;
import java.util.function.Supplier;

public class DialogWithCustomer {
    static int countTimes;

    public void dialogFirst() {
        System.out.println("* * * Software for generation passwords * * *");

        System.out.println("enter\n1 - generation simple password\n2 - generation with two keywords\n(The first must contain words 5 and more chars, the second must contain numbers 5 and more chars)");
    }

    public void dialogSimpleMethod() {
        System.out.println("How many characters should be in your password?");
    }

    public void dialogWithKeywords(PasswordBody passwordBody) {
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            countTimes++;
            System.out.println("Enter keyword " + countTimes);
            return scanner.nextLine();
        };
        String one = supplier.get();
        while (one.length() > 0 && one.length() < 5){
            System.out.println("Your word contains " + one.length() + " char. " + "Need 5and more chars");
            one = supplier.get();
        }
        String two = supplier.get();
        while (two.length()> 0 && two.length() < 5){
            System.out.println("Your word contains " + two.length() + " char. " + "Need 5and more chars");
            two = supplier.get();
        }
        passwordBody.setKeyWordOne(one);
        passwordBody.setKeywordTwo(two);
    }

}