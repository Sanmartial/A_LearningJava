package LessonsJava.patternsProgramming.Factory;

public class AbstractFactrory {
    public static void main(String[] args) {
    Factory carFactory = new AbstractFactory().createFacory("Car");
    Factory tankFactory = new AbstractFactory().createFacory("Tank");
    Car toyota = carFactory.createCar("Toyota");
    Tank t80 = tankFactory.createTank("T80");

    t80.drive();
    toyota.drive();
    }
}


interface Factory{
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

class AbstractFactory {
    Factory createFacory(String typeFactory){
        if(typeFactory.equals("Tank"))
            return new TankFactory();
        if(typeFactory.equals("Car"))
            return new CarFactory();
        else
            return null;
    };
}

interface Car{
    void drive();
}

class Toyota implements Car{

    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Drive AUDI");
    }
}

class CarFactory implements Factory{
    public Car createCar(String typeOfCar){
        if(typeOfCar.equals("Toyota"))
            return new Toyota();
        if(typeOfCar.equals("AUDI") || typeOfCar.equals("Audi"))
            return new Audi();
        else
            return null;
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

interface Tank{
    void drive();
}

class T72 implements Tank{

    @Override
    public void drive() {
        System.out.println("Drive T72");
    }
}

class T80 implements Tank{
    @Override
    public void drive() {
        System.out.println("Drive T80");
    }
}

class TankFactory implements Factory{
    public Tank createTank(String typeOfCar){
        if(typeOfCar.equals("T72"))
            return new T72();
        if(typeOfCar.equals("T80"))
            return new T80();
        else
            return null;
    }
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }


}