package LessonsJava.patternsProgramming.Singelton;

import org.apache.commons.math3.analysis.function.Sin;

public class SingeltonReapeat {
    public static void main(String[] args) {
  Singelton singelton = Singelton.getInsurance();

    }
}

class Singelton{
    static Singelton singelton = new Singelton();

    public Singelton() {
    }

    static Singelton getInsurance(){
        return singelton;
    }
}