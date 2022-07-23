package ApplicationReZerV.Password;


import java.util.Scanner;

public class Generation {
    private int countValue = 0;

    public int getCountValue() {
        return countValue;
    }

    public void getcountV (){
        System.out.println("Введите количество символов в Вашем пароле:");
        Scanner in = new Scanner(System.in);
        this.countValue = in.nextInt();

    }

    public char getChar (){
        char ch = (char) (Math.random() * 122);
        while (!Character.isLetterOrDigit(ch))
            ch = (char) (Math.random() * 122);
        return ch;
    }

    public void getPassword(){
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i < countValue; i++){
            sb1.append(getChar());
        }
        System.out.println(sb1);
    }

}
