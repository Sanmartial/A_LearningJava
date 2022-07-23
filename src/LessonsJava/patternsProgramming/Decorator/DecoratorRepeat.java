package LessonsJava.patternsProgramming.Decorator;

import org.apache.commons.collections4.Get;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DecoratorRepeat {
    public static void main(String[] args) {
GetService coffee = new Coffee("Capuchino", 0.7);
GetService tes = new Tea("Imbir", 0.55);
GetService teaWithBerg = new TeaWithBergamot(tes);
GetService coffeeWithMilk = new CoffeeWithMilk(coffee);
        System.out.println("total - " + (coffee.getPrice() + tes.getPrice()));
        System.out.println("total with dops -" + (coffeeWithMilk.getPrice() + teaWithBerg.getPrice()));

    }
}

interface GetService{
    String getLabel();
    Double getPrice();

}

class Coffee implements GetService{
    private String label;
    private Double price;

    public Coffee(String label, Double price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}

class Tea implements GetService{
    private String label;
    private Double price;

    public Tea(String label, Double price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}

class DecoratorCafe implements GetService{
    GetService getService;
    private String label;
    private Double price;

    public DecoratorCafe(GetService getService, String label, Double price) {
        this.getService = getService;
        this.label = label;
        this.price = price;
    }

    @Override
    public String getLabel() {
        return this.label+ getService.getLabel();
    }

    @Override
    public Double getPrice() {
        return this.price+ getService.getPrice();
    }
}

class CoffeeWithMilk extends DecoratorCafe{
    public CoffeeWithMilk(GetService getService) {
        super(getService, "coffee with milk", 0.15);
    }
}

class TeaWithBergamot extends DecoratorCafe{
    public TeaWithBergamot(GetService getService) {
        super(getService, "tea with bergamot", 0.12);
    }
}