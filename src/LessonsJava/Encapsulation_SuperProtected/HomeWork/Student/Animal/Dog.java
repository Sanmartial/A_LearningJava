package LessonsJava.Encapsulation_SuperProtected.HomeWork.Student.Animal;

public class Dog extends Pet {


    public Dog(String name){
        super(name);
        System.out.println("i am dog and my name is: " + name);
    }

    public void play(){
        System.out.println("Dog plays");
    }



}
