package LessonsJava.EqualsToStringWrapperClass;

public class Test5 {


    public static void main(String[] args) {
Animal an = new Animal();
Lion ln = new Lion();

    }

}

class Animal {
    Animal(){System.out.println("Konstructor of Animal");}
    static { System.out.println("static init in Animal");}
    {System.out.println("non-static in Animal");}
           }
 class Mammal extends Animal {
     Mammal(){System.out.println("Konstructor of Mammal");}
     static { System.out.println("static init in Mammal");}
     {System.out.println("non-static in Mammal");}
           }
class Lion extends Mammal {
    Lion(){System.out.println("Konstructor of Lion");}
    static { System.out.println("static init in Lion");}
    {System.out.println("non-static in Lion");}
}