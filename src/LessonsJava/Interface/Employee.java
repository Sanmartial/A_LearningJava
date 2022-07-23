package LessonsJava.Interface;

public class Employee implements Comparable<Employee>{
    private int ID;
    private String sex;
    private String name;
    private int old;
    private int weight;
    private int experience;
    private int salary;

    public Employee(int ID, String sex, String name, int old, int weight, int experience, int salary) {
        this.ID = ID;
        this.sex = sex;
        this.name = name;
        this.old = old;
        this.weight = weight;
        this.experience = experience;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", weight=" + weight +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if(this.ID == anotherEmp.ID)
            return 0;
        else if (this.ID < anotherEmp.ID)
            return -1;
        else {
            return 1;
        }
    }
}
