package LessonsJava.Vol_1_Basics.testPakage;

public class Crow extends Bird {
    private String color;

    public Crow(String name, Boolean flyYN, String color) {
        super(name, flyYN);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voiceT() {
        super.voiceB();
        System.out.println("Kar-Kar");
    }

}
