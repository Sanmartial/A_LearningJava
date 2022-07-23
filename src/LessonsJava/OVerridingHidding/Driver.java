package LessonsJava.OVerridingHidding;

public class Driver extends Employee{
    private String nameCar;

    public Driver(String sex, String name, int old, int weight, int experience, int salary, String nameCar) {
        super(sex, name, old, weight, experience, salary);
        this.nameCar = nameCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public void driverCar(){
        System.out.println("Driving Car");
    }
}
