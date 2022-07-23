package LessonsJava.OVerridingHidding;

public class ShowMain {
    public static void main(String[] args) {

Teacher pe = new Teacher("Male", "Vera", 25, 50,5, 1500, 15);
Doctor doc1 = new Doctor("Female", "Julia", 27, 55,7,1780,"Therapist");

        pe.sleep();
        pe.eat();
        doc1.eat();
        doc1.sleep();
ShowMain sh = new ShowMain();
Employee e = new Doctor("Female", "Darla", 27, 55,7,1780,"Therapist");
e.ABC();
sh.abc(e);
sh.abc(doc1);
        System.out.println(pe.getName());
    }

void abc(Employee e){
    System.out.println("E");
}

void abc(Doctor d){
    System.out.println("D");
}



}