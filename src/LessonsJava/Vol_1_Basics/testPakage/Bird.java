package LessonsJava.Vol_1_Basics.testPakage;

public class Bird implements FlyAble{
    private String name;
    private Boolean flyYN;

    @Override
    public String nameBB() {
        return FlyAble.super.nameBB();
    }

    public Bird(String name, Boolean flyYN) {
        this.name = name;
        this.flyYN = flyYN;
    }

    public String getName() {
        return name;
    }

    public Boolean getFlyYN() {
        return flyYN;
    }

    public void setFlyYN(Boolean flyYN) {
        this.flyYN = flyYN;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void canFly() {
        if(flyYN)
        System.out.println("I am a " + getName() + " and I can fly");
        else
        System.out.println("I am a " + getName() + " and I can't fly");
    }

    public void voiceB(){
        System.out.println("tuy-tuy");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
