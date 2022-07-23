package LessonsJava.Encapsulation_SuperProtected.HomeWork.Student.Animal;

public class Pet extends Animal{
    private String name;
    private int nail = 1;
    private int paw = 4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNail() {
        return nail;
    }

    public void setNail(int nail) {
        this.nail = nail;
    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }

    public Pet(String name){
        System.out.println("i am pet");
    }
    public void run(){
         System.out.println("Pets runs");
     }

     public void jump(){
         System.out.println("Pet jumps");
     }

}
