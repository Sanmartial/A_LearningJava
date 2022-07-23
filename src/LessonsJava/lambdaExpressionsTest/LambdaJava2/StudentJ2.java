package LessonsJava.lambdaExpressionsTest.LambdaJava2;

public class StudentJ2 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double averadge = 0.00;

    public StudentJ2(String name, char sex, int age, int course, double averadge) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averadge = averadge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAveradge() {
        return averadge;
    }

    public void setAveradge(double averadge) {
        this.averadge = averadge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", averadge=" + averadge +
                '}';
    }
}

