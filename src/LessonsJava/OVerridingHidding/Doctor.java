package LessonsJava.OVerridingHidding;

public class Doctor extends Employee {
   private String specialization;
   String s1 = super.getName() + " Dr";
    public void treat(){
        System.out.println("I treating");
    }

    @Override
    public void sleep() {
        System.out.println("Doctor sleeps");
    }

    public void sleep(String name) {
        System.out.printf("Doctor %s sleeps\n", name);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Doctor(String sex, String name, int old, int weight, int experience, int salary, String specialization) {
        super(sex, name, old, weight, experience, salary);
        this.specialization = specialization;
    }



}
