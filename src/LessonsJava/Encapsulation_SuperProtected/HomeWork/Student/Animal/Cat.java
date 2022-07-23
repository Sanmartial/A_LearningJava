package LessonsJava.Encapsulation_SuperProtected.HomeWork.Student.Animal;

public class Cat extends Pet {


    public Cat(String name) {
        super(name);
        System.out.println("I am Cat and my name: " + name);
    }

    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
