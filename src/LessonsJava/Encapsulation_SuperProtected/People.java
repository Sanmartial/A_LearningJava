package LessonsJava.Encapsulation_SuperProtected;

public class People {
    final private String sex;
    private String name;
    private int old;
    private int weight;
    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        if(old > 0)
        this.old = old;
        if(old < 0)
            System.out.println("Exception. Old cannot be < 0");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0)
        this.weight = weight;
        if(weight < 0)
            System.out.println("Exception. Weight cannot be < 0");
    }

    public People(String sex, String name) {

        this.sex = sex;
        this.name = name;
    }

    public People(String sex) {
        this.sex = sex;
    }

    public People(String sex, String name, int old) {
        this.sex = sex;
        this.name = name;
        if(old > 0)
            this.old = old;

        if(old < 0)
                System.out.println("Old cannot be < 0");
    }

    public People(String sex, String name, int old, int weight) {
        this.sex = sex;
        this.name = name;
        if(old > 0)
            this.old = old;

        if(old < 0)
            System.out.println("Old cannot be < 0");

        if(weight > 0)
            this.weight = weight;

        else if (weight < 0)
            System.out.println("Weight cannot be < 0");
    }

    ShowMain sm = new ShowMain();



}
