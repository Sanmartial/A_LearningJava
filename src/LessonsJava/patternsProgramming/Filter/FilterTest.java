package LessonsJava.patternsProgramming.Filter;

import LessonsJava.lambdaExpressionsTest.LambdaExpressionU0.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FilterTest {
    public static void main(String[] args) {
        List<CarF> carList = new ArrayList<>();
        List<CarF> carFilterList = new ArrayList<>();
        CarF carF1 = new CarF(250, "red", 4);
        CarF carF2 = new CarF(220, "green", 2);
        CarF carF3 = new CarF(180, "grey", 4);
        carList.add(carF1);
        carList.add(carF2);
        carList.add(carF3);

        carFilterList = new SpeedFilter().filter(carList);
        for (CarF car: carFilterList ) {
            System.out.println(car.getMaxSpeed());
        }
        OrFilter orFilter = new OrFilter(new SpeedFilter(), new DoorFilter());
        carList = orFilter.filter(carList);
        for (CarF car: carList) {
            System.out.println(car.getMaxSpeed());
        }

    }
}

class CarF{
    private int maxSpeed;
    private String color;
    private int doors;

    public CarF(int maxSpeed, String color, int doors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.doors = doors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "CarF{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarF carF = (CarF) o;
        return maxSpeed == carF.maxSpeed && doors == carF.doors && color.equals(carF.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, color, doors);
    }
}

interface CarFilter{
    List<CarF> filter(List<CarF>carF);
}

class SpeedFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> carF) {
        List<CarF> list = new ArrayList<>();
        for (CarF car: carF) {
            if(car.getMaxSpeed() > 200){
                list.add(car);
            }
        }
        return list;
    }
}

class DoorFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> carF) {
        List<CarF> list = new ArrayList<>();
        for (CarF car: carF) {
            if(car.getDoors() > 2){
                list.add(car);
            }
        }
        return list;
    }
}

class AndFilter implements CarFilter{
    CarFilter filterOne;
    CarFilter filterTwo;

    public AndFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }



    @Override
    public List<CarF> filter(List<CarF> carF) {
        List<CarF>list = filterOne.filter(carF);
        return filterTwo.filter(list);
    }
}

class OrFilter implements CarFilter{
    CarFilter filterOne;
    CarFilter filterTwo;

    public OrFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    @Override
    public List<CarF> filter(List<CarF> carF) {
        List<CarF>list = filterOne.filter(carF);
        List<CarF>list2 = filterTwo.filter(carF);
        for (CarF car:list2 ) {
            if(!list.contains(car))
                list.add(car);
        }
        return list;
    }
}