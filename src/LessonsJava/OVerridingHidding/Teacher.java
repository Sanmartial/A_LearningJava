package LessonsJava.OVerridingHidding;

public class Teacher extends Employee{
    private int countChild;

    public Teacher(String sex, String name, int old, int weight, int experience, int salary, int countChild) {
        super(sex, name, old, weight, experience, salary);
        this.countChild = countChild;
    }

    public int getCountChild() {
        return countChild;
    }

    @Override
    public void eat() {
        System.out.println("Eating Teacher");
    }

    public void setCountChild(int countChild) {
        this.countChild = countChild;
    }

    public void Learn(){
        System.out.println("Learning");
    }

}
