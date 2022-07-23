package LessonsJava.patternsProgramming.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        CarP carP = new CarProxy();
        carP.drive();
    }
}

interface CarP{
    void drive();
}

class Lada implements CarP{
    @Override
    public void drive() {
        System.out.println("Lada drive");
    }
}

class CarProxy implements CarP{
    CarP carP = new Lada();
    @Override
    public void drive() {
        System.out.println("proxyCode");
        carP.drive();
    }
}