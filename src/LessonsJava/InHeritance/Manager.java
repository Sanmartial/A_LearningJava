package LessonsJava.InHeritance;

import java.util.Objects;

public class Manager extends Employee{
private double bonus;

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        if(!(o instanceof Employee)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public int compareTo(Employee other) {
        return super.compareTo(other);
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return  baseSalary + bonus;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " bonus= " + bonus;
    }
}
