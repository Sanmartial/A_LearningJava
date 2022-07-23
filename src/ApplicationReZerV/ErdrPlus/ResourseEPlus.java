package ApplicationReZerV.ErdrPlus;

import java.util.Scanner;

public class ResourseEPlus {

    public Integer listForChoice(){
        System.out.println("1- сравнить два списка ердр\n2- подготовить список в формате 1 2021 10001-1234567\n" +
                "3- подготовить список в формате 12021100011234567000 (с 000 в конце)\n4- исправить номер статьи с ст.185 ч.1 на 185 (из файла statUK.txt)");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        while(choise < 1 || choise > 4){
            System.out.println("Введите один из указанных номеров повторно");
            choise = scanner.nextInt();
        }
        //System.out.println("Выбор - " + choise);
        System.out.println(textAfterChoice(choise));
    return choise;}

    public String textAfterChoice(int choice){
        if(choice == 1) {
            return "Сравниваю два списка ЕРДР";
        }
        if(choice == 2) {
            return "Подготавливаю список";
        }
        if(choice == 3) {
            return "Подготавливаю список";
        }
        if(choice == 4) {
            return "Исправляю номера статьи УК";
        }
        else
                return "";

    }
}
