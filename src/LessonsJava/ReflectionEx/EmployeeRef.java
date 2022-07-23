package LessonsJava.ReflectionEx;

public class EmployeeRef {
    public int ID;
    public String name;
    public String department;
    private double salary = 1001.25;

    public EmployeeRef(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    public EmployeeRef(int ID, String name, String department, double salary) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

        public void increaseSalary(){
        this.salary *= 2;
        }

    private void changeDepartment(String newDepartment){
        this.department = newDepartment;
        System.out.println("new department is " + department);
    }

    @Override
    public String toString() {
        return "EmployeeRef{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public EmployeeRef() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
