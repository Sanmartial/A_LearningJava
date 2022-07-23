package LessonsJava.IONIO.SerialJAR;
//https://www.youtube.com/watch?v=1nxB_2WqvAc&ab_channel=%D0%98%D0%B7%D1%83%D1%87%D0%B0%D0%B5%D0%BCJava
import java.io.Serializable;

public class FirstJAR implements Serializable {
    private static final long serialVersionUID = 199L;
    private String name;
    private String lastName;
    private String Other;

    public String getOther() {
        return Other;
    }

    public void setOther(String other) {
        Other = other;
    }

    @Override
    public String toString() {
        return "FirstJAR{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Other='" + Other + '\'' +
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
