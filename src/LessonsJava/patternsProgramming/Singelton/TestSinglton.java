package LessonsJava.patternsProgramming.Singelton;

public class TestSinglton {
    public static void main(String[] args) {
    SingeltonT singeltonT = SingeltonT.getInstance();
    }
}

class SingeltonT{
    static SingeltonT singeltonT = new SingeltonT();

    public static SingeltonT getInstance() {
        return singeltonT;
    }


    private SingeltonT() {
    }
}