package LessonsJava.InHeritance;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Vasya", 150000,1987,12,15, 1200);


        Employee staff[] = new Employee[3];

        //if(staff[0] instanceof Manager){
        staff[0] = boss;
        //}

        staff[1] = new Employee("ROman", 100000, 2000,8,1);
        staff[2] = new Employee("Ivan", 99000, 2003, 11,15);
        for(Employee e: staff)
            System.out.println("name - " + e.getName() + ", salary "  + e.getSalary());
    }
}
