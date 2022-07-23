package LessonsJava.patternsProgramming.Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        double cost;
Service manHairCut = new HairCut("MenHairCut", 200);
Service classicManicure = new Manicure("Classic", 450);
Service hairAndBeard = new ManHairCutAndBeard(manHairCut);
Service manicAndPaint = new ClassicManikureAndSilverPaint(classicManicure);

        System.out.println(manicAndPaint.getLabel());
        System.out.println(hairAndBeard.getPrice());
        System.out.println(manicAndPaint.getPrice());
    }
}

interface Service{
    double getPrice();
    String getLabel();
}

class HairCut implements Service {
private String label;
private double price;

    public HairCut(String label, double price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}

class Manicure implements Service{
    private String label;
    private double price;

    public Manicure(String label, double price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}

class OptionDecorator implements Service{
    private Service service;
    private String label;
    private double price;

    public OptionDecorator(Service service, String label, double price) {
        this.service = service;
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price + service.getPrice();
    }

    @Override
    public String getLabel() {
        return this.label + service.getLabel();
    }
}

class ManHairCutAndBeard extends OptionDecorator{

    public ManHairCutAndBeard(Service service) {
        super(service, "Hair cut and beard", 60);
    }
}

class ClassicManikureAndSilverPaint extends OptionDecorator{
    public ClassicManikureAndSilverPaint(Service service) {
        super(service, "Classic Manicure and silver paint ", 70);
    }
}