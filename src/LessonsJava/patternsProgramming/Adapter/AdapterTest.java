package LessonsJava.patternsProgramming.Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new TrackWrap(new MeThack()));

    }
}

class TrackWrap implements Car{
    Track track;

    public TrackWrap(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}
interface Track{
    void clean();
}

class MeThack implements Track{

    @Override
    public void clean() {
        System.out.println("Your track is cleaned");
    }
}

interface Car{
    void wash();
}

class  Audi implements Car{

    @Override
    public void wash() {
        System.out.println("car is washed");
    }
}
class CarWash{
    public void washCar(Car car){
        car.wash();
    }
}