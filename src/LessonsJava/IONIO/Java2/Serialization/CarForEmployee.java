package LessonsJava.IONIO.Java2.Serialization;

import java.io.Serializable;

public class CarForEmployee implements Serializable {
    private String model;
    private String color;

    public CarForEmployee(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarForEmployee{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
