package LessonsJava.Polymorphism;

public class Doctor extends Employee implements Help_able {
    public String specialisation;
    @Override
    void work() {
        System.out.println("Doctor works");
    }
    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}
