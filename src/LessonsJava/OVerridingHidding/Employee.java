package LessonsJava.OVerridingHidding;

public class Employee extends People {

private int experience;
private int salary;



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

    public Employee(String sex, String name, int old, int weight, int experience, int salary) {
        super(sex, name, old, weight);
        this.experience = experience;
        this.salary = salary;
    }

    public  void eat(){
        System.out.println("I eating employee");
          }
    public  void sleep(){
        System.out.println("i sleeping");
    }
    static void ABC(){
        System.out.println("Employee");
    }
}
