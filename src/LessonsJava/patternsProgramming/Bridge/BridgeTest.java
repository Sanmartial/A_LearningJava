package LessonsJava.patternsProgramming.Bridge;

public class BridgeTest {
    public static void main(String[] args) {
ICar car = new ToyotaCAr(new CarBridge());
car.drive();
    }
}
abstract class ICar{
    IBridge iBridge;
    public ICar(IBridge iBridge) {
        this.iBridge = iBridge;
    }
    abstract public void drive();
}
abstract class ITrack {
    IBridge iBridge;
    public ITrack(IBridge iBridge) {
        this.iBridge = iBridge;
    }
    abstract public void drive();
}

interface IBridge{
    void drive();
}

class CarBridge implements IBridge{
    @Override
    public void drive() {
        System.out.println("drive car");
    }
}
class TrackBridge implements IBridge{
    @Override
    public void drive() {
        System.out.println("track drive");
    }
}
class ToyotaCAr extends ICar{
    public ToyotaCAr(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("Toyota drive");

    }
}

class AudiCar extends ICar{
    public AudiCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("Audi drive");
    }
}

class ToyotaTrack extends ITrack{
    public ToyotaTrack(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("ToyotaTrack drive");
    }
}