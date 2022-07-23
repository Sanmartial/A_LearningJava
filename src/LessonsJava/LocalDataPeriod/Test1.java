package LessonsJava.LocalDataPeriod;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getDayOfMonth() + "/" + ld.getMonthValue() + "/" + ld.getYear());
        LocalDate ld1 = LocalDate.of(2021, Month.MARCH, 8);
        LocalTime lt1 = LocalTime.of(16,25);
        LocalTime lt2 = LocalTime.now();
        System.out.println(lt1 + " " + lt2);
        LocalDateTime ldt = LocalDateTime.of(2021, 3,16,18,05,25,10000);
        System.out.println(ldt);
        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        DayOfWeek dayOfWeek = ldt.getDayOfWeek();
        DayOfWeek dayOfWeekPlus = ldt.getDayOfWeek().plus(1);
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Today is ").append(dayOfWeek).append(" and tomorrow will be ").append(dayOfWeekPlus);

        System.out.println(sb1);

        Period p= Period.ofDays(2);
        LocalDate ld11 = LocalDate.now().plus(p);
        System.out.println(ld11);
        System.out.println(p.toString());

        Duration d = Duration.ofDays(10);
        System.out.println(ldt.plus(d));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM YY");
        System.out.println(ld11.format(f));


    }//main
    
}//class
