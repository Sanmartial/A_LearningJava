package LessonsJava.lambdaExpressionsTest.LambdaExpressionU0;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Our car is " +
                " model='" + model + '\'' +
                ", color= '" + color + '\'' +
                ", engine= " + engine;
    }
}

class Test30_7{
    public static ArrayList<Car> createThreeCars (Supplier<Car> cS) {
    ArrayList <Car> al = new ArrayList<>();
    for(int i = 0; i < 3; i++)
        al.add(cS.get());
    return al;
    }

    public static void changeCar (Car car, Consumer <Car> consumer){
        consumer.accept(car);
    }
    public static void main(String[] args) {
        ArrayList <Car> ourCar = createThreeCars(() -> new Car("Nisan", "Silver", 1.6));
        System.out.println("ourcars " + ourCar);

        changeCar(ourCar.get(0), car -> { car.color = "red"; car.engine = 2.4;
            System.out.println(car);});
    }
}