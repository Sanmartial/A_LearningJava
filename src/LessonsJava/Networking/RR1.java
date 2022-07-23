package LessonsJava.Networking;

import LessonsJava.Encapsulation_SuperProtected.HomeWork.Student.Animal.Animal;
import LessonsJava.Encapsulation_SuperProtected.HomeWork.Student.Animal.Cat;

public class RR1 extends Horse implements Mammal {
    public static void main(String[] args) {
        RR1 myApp = new RR1();
        System.out.println(myApp.identifyMyself());
    }
}
 interface Mammal {
    String identifyMyself();

     static void SSRR(int s) {

     }
 }

class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}