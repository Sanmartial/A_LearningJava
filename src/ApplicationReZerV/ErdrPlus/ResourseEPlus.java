package ApplicationReZerV.ErdrPlus;

import java.util.Scanner;

public class ResourseEPlus {

    public Integer listForChoice(){
        System.out.println("1- compare two lists\n2- prepare list like this pattern 1 2021 10001-1234567\n" +
                "3- prepare list like this pattern 12021100011234567000 (with 000 )\n4- correct the article number from ct.185 ch.1 like 185 (from file statUK.txt)");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        while(choise < 1 || choise > 4){
            System.out.println("Enter one of the given numbers again");
            choise = scanner.nextInt();
        }
        //System.out.println("Выбор - " + choise);
        System.out.println(textAfterChoice(choise));
    return choise;}

    public String textAfterChoice(int choice){
        if(choice == 1) {
            return "Comparing two ERDR lists";
        }
        if(choice == 2) {
            return "I'm preparing a list";
        }
        if(choice == 3) {
            return "I'm preparing a list";
        }
        if(choice == 4) {
            return "Correcting article numbers of the Criminal Code";
        }
        else
                return "";

    }
}
