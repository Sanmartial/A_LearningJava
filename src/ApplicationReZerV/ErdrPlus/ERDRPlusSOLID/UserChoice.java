package ApplicationReZerV.ErdrPlus.ERDRPlusSOLID;

import java.util.Scanner;

public class UserChoice {
    private int choice;
    public void choice() {
        Scanner scanner = new Scanner(System.in);
        this.choice = scanner.nextInt();
    }

    public int getChoice() {
        return choice;
    }
}
