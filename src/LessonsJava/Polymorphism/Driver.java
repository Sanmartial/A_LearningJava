package LessonsJava.Polymorphism;

public class Driver extends Employee implements Help_able {
   public String nameCar = "Lada";
    @Override
    void work() {
        System.out.println("Driver works");
    }
    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}