package LessonsJava.patternsProgramming.Prototype;

import javax.management.monitor.Monitor;

public class PrototypeRepeat {
    public static void main(String[] args) throws CloneNotSupportedException {
    Cashe cashe = new Cashe();
    cashe.setStudent1(new Student1());
    Student1 student1 = cashe.getStudent1();

    }
}

class Student1 implements Cloneable{
    @Override
    protected Student1 clone() throws CloneNotSupportedException {
        return (Student1) super.clone();
    }
}

class Cashe {
    private Student1 student1;

    public Student1 getStudent1() throws CloneNotSupportedException {
        return student1.clone();
    }

    public void setStudent1(Student1 student1) {
        this.student1 = student1;
    }
}