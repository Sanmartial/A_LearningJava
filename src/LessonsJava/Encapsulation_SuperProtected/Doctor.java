package LessonsJava.Encapsulation_SuperProtected;

public class Doctor extends Employee{
   private String specialization;
    public void treat(){
        System.out.println("I treating");
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Doctor(String sex, String name, int experience, String specialization) {
        super(sex, name, experience);
        this.specialization = specialization;
    }

    public Doctor(String sex, int experience, String specialization) {
        super(sex, experience);
        this.specialization = specialization;
    }

    public Doctor(String sex, String name, int old, int experience, String specialization) {
        super(sex, name, old, experience);
        this.specialization = specialization;
    }

    public Doctor(String sex, String name, int old, int weight, int experience, String specialization) {
        super(sex, name, old, weight, experience);
        this.specialization = specialization;
    }


}
