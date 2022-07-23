package LessonsJava.EqualsToStringWrapperClass;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        var car1 = new Car("red", "v4");
        var car2 = new Car("red ", "v4");
        var car3 = new Car("Yellow", "v8");
        System.out.println(car1.equals(car2));
        System.out.println(car1.toString());
    }
    }

    class Car{
    String color, engine;

        public Car(String color, String engine) {
            this.color = color;
            this.engine = engine;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", engine='" + engine + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return color.equals(car.color) && engine.equals(car.engine);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color, engine);
        }
    }