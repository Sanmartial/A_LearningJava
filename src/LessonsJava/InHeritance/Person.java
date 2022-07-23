package LessonsJava.InHeritance;

public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}
