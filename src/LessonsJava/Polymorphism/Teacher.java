package LessonsJava.Polymorphism;

public class Teacher extends Employee implements Help_able {
   int countChild = 25;
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}
