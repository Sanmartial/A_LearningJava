package LessonsJava.InHeritance;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee> {

private double salary;
private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month,  day);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("это работник с зарплатой %f $", salary);
    }

    public void raiseSalary (double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee other) {

        return Double.compare(salary, other.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && hireDay.equals(employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), salary, hireDay);
    }

    @Override
    public String toString() {
        return super.toString() + " salary= " + salary +
                ", hireDay= " + hireDay;
    }
}
