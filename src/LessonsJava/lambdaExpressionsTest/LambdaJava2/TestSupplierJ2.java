package LessonsJava.lambdaExpressionsTest.LambdaJava2;

import ApplicationReZerV.CommonMethods.CommonMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestSupplierJ2 {

    public static List<CarTS> createThreeCar(Supplier<CarTS> carTSSupplier){
        List<CarTS> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carTSSupplier.get());
        }
    return list;}

    public static void chanegCar(CarTS car, Consumer<CarTS> consumer){
        consumer.accept(car);
    };

    public static String avgCar(List<CarTS> list, Function<CarTS, String> car){

    return null;}

    public static void main(String[] args) {
        List<CarTS> listCar = createThreeCar(() -> new CarTS("Nissan Juke", "Yellow", 1.8));

        chanegCar(listCar.get(0), car -> {car.color = "blue";
            car.engine = 2.0;});

        CommonMethods.showList(listCar);
    }

    Function<CarTS, String> f = car -> car.color;



}

class CarTS{
    String model;
    String color;
    double engine;

    public CarTS(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "CarTS{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
