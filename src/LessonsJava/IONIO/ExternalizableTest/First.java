package LessonsJava.IONIO.ExternalizableTest;

public class First {
    private String name;
    private String lastName;


    @Override
    public String toString() {
        return "First{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
