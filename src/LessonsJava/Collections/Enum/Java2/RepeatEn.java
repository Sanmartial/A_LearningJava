package LessonsJava.Collections.Enum.Java2;

public class RepeatEn {
    public static void main(String[] args) {
        ColorFence colorFence = new ColorFence(Color.BLUE);
        colorFence.todayFenceIs();
    }
}

enum Color{
    BLACK("cold"),
    RED("warm"),
    YELLOW("warm"),
    BLUE("cold"),
    GREY("cold"),
    GREEN("warm"),
    PINK("warm");

    private String temperatireColour;

    Color(String temperatireColour) {
        this.temperatireColour = temperatireColour;
    }

    public String getTemperatireColour() {
        return temperatireColour;
    }
}

class ColorFence{
    Color color;

    public ColorFence(Color color) {
        this.color = color;
    }

    void todayFenceIs(){
        switch (color){
            case RED -> {System.out.print("Today the fence is red"); break;}
            case BLUE -> {System.out.print("Today the fence is blue"); break;}
            case GREY -> {System.out.print("Today the fence is grey"); break;}
            case GREEN -> {System.out.print("Today the fence is green"); break;}
            case PINK -> {System.out.print("Today the fence is pink"); break;}
            case BLACK -> {System.out.print("Today the fence is black"); break;}
            case YELLOW -> {System.out.print("Today the fence is yellow"); break;}
        }

        System.out.println(" and the temperature color is " + color.getTemperatireColour());
    }
}