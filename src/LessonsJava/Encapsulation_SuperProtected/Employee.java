package LessonsJava.Encapsulation_SuperProtected;

public class Employee extends People {

private int experience;
private int salary;

    public Employee(int salary, String name) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {


        return experience;
    }

    public void setExperience(int experience) {
        if(experience < 0)
            System.out.println("Exception. Exp cannot be < 0");
        if(experience > 0)
            this.experience = experience;
    }

    public Employee(String sex, String name, int experience) {
        super(sex, name);
        if(experience < 0)
            System.out.println("Exception. Exp cannot be < 0");
        if(experience > 0)
        this.experience = experience;
    }

    public Employee(String sex, int experience) {
        super(sex);
        if(experience < 0)
            System.out.println("Exception. Exp cannot be < 0");
        if(experience > 0)
        this.experience = experience;
    }

    public Employee(String sex, String name, int old, int experience) {
        super(sex, name, old);
        if(experience < 0)
            System.out.println("Exception. Exp cannot be < 0");
        if(experience > 0)
        this.experience = experience;
    }

    public Employee(String sex, String name, int old, int weight, int experience) {
        super(sex, name, old, weight);
        if(experience < 0)
            System.out.println("Exception. Exp cannot be < 0");
        if(experience > 0)
        this.experience = experience;
    }

    public  void eat(){
        System.out.println("I eating");
          }
    public  void sleep(){
        System.out.println("i sleeping");
    }
}
