package LessonsJava.Polymorphism;

public class Test_25 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();
       Employee [] array2 = {emp1, emp2, emp3};
        Teacher t1 = (Teacher) emp1;
         System.out.println( t1.countChild);
        System.out.println(((Driver)emp3) .nameCar);
        Employee doc1 = new Doctor();

       for(Employee emp: array2)
           emp.work();
        System.out.println(emp1 instanceof Employee);

        int a = 5;
        byte b = (byte) a;

        byte c = 125+2;
        int d = c;
        System.out.printf("%d %d\n",c, d);

    }
}
