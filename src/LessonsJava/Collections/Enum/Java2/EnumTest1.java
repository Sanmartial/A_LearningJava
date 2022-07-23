package LessonsJava.Collections.Enum.Java2;

import java.util.Arrays;

public class EnumTest1 {
    public static void main(String[] args) {

        Today today = new Today(WeekDays.THURSDAY);
        today.daysInfo();

        WeekDays w1 = WeekDays.valueOf("MONDAY");
        System.out.println(w1);

        WeekDays [] w2 = WeekDays.values();
        System.out.println(Arrays.toString(w2));


    }
}
enum WeekDays{
    MONDAY("bad"), TUESDAY("bad"), WEDNESDAY("so-so"), THURSDAY("already better"), FRIDAY("good"), SATURDAY("great"), SUNDAY("good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today{
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo(){
        switch (weekDays){
            case MONDAY:
            case WEDNESDAY:
            case TUESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("go to the job!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Today you will can to rest");
                break;
        }
        System.out.println("The mood is " + weekDays.getMood() + " today!");
    }

}