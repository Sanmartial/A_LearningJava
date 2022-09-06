package ApplicationReZerV.PasswordGen;

import java.io.IOException;
import java.util.Scanner;
import java.util.function.Supplier;

public class MainMethodPass {
    public static void main(String[] args) throws InterruptedException, IOException {
        PasswordBody passwordBody = new PasswordBody();
        DialogWithCustomer dialog = new DialogWithCustomer();
        Supplier<Integer> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        };
        dialog.dialogFirst();
        int choice = supplier.get();
        while (choice < 0 || choice > 2) {
            System.out.println("Wrong result. Attempt again!");
            choice = supplier.get();
        }

        switch (choice) {
            case 1 -> {
                dialog.dialogSimpleMethod();
                passwordBody.setCountChar(supplier.get());
                passwordBody.getSimpleResult();
            }
            case 2 -> {
                dialog.dialogWithKeywords(passwordBody);
                passwordBody.getResultKeywords();
            }
            default -> {
                System.out.println("Wrong result. Exit");
                System.exit(1);
            }
        }


    }
}
