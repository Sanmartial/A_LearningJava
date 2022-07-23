package LessonsJava.patternsProgramming.Adapter;


public class AdapterRepeat {
    public static void main(String[] args) {
      CarWashW carWashW = new CarWashW();
      carWashW.washCar(new WrappTrack(new MyTrack()));

    }
}
class WrappTrack implements CarW{
    TrackW trackW;

    public WrappTrack(TrackW trackW) {
        this.trackW = trackW;
    }

    @Override
    public void washCar() {
        trackW.clearTrack();
    }
}
interface CarW{
    void washCar();
}

class AudiW implements CarW{
    @Override
    public void washCar() {
        System.out.println("AudiW is washed");
    }
}
class CarWashW{
    public void washCar(CarW carW){
        carW.washCar();
    }
}

interface TrackW{
    void clearTrack();
}

class MyTrack implements TrackW{
    @Override
    public void clearTrack() {
        System.out.println("My Track is clean");
    }
}