package LessonsJava.LocalDataPeriod;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
static void smenaDejurnogo(LocalDate start, LocalDate end, Period p){
    LocalDate date = start;
    while(date.isBefore(end)){
        System.out.println("Наступила дата " + date + ". Пора менять пароль!");
        date = date.plus(p);
    }

}

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        Period p = Period.ofMonths(10);
        ld.plus(p);
        LocalDate start = LocalDate.of(2021,03,17);
        LocalDate end = LocalDate.of(2022,03,17);

        smenaDejurnogo(start, end, p);
    }
}
