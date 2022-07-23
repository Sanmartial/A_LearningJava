package LessonsJava.Encapsulation_SuperProtected;

public class ShowMain {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Male", "Ivan", 25, 5, "Surgeon");
        doc1.sleep();
        doc1.treat();
        System.out.println(doc1.getExperience());


    }



}