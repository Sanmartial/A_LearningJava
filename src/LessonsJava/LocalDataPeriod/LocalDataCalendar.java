package LessonsJava.LocalDataPeriod;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class LocalDataCalendar {
    public static void main(String[] args) throws InterruptedException {
        int y = 1975;
        int m = 8;
        int d = 6;
        LocalDate data = LocalDate.now();
        LocalDate data1 = LocalDate.of(y,m,d);
        LocalDate data3 = data.withDayOfMonth(31);
        System.out.println("data3 - " + data3);
        System.out.println("data - " + data);
        System.out.println("data1 - " + data1);
        int year = data.getYear();
        int month = data.getMonthValue();
        int day = data.getDayOfMonth();

        System.out.printf("%d-%d-%d\n", day, month, year);

        //data = data.plusYears(25);
        int year1 = data.getYear();
        System.out.printf("%d-%d-%d\n", day, month, year1);
        DayOfWeek day1 = data.getDayOfWeek();
        int weekly = day1.getValue();
        System.out.println("day1 - " + day1 + " " + weekly);

        Calendar bday = Calendar.getInstance();
        System.out.println("bday - " + bday.getTime());

        bday.set(Calendar.YEAR, 2021);
        bday.set(Calendar.MONTH, Calendar.JANUARY);
        bday.set(Calendar.DATE,04);
        System.out.println(bday.getFirstDayOfWeek());

        Date bday2 = bday.getTime();
        System.out.println(bday2);
        DateFormat simple = DateFormat.getInstance();
        String now = simple.format(new Date());
        System.out.println(now);

        Date date1 = new Date();
        Thread.sleep(10);
        Date date2 = new Date();

        String now1 = simple.format(new Date());
        System.out.println(date2 + "\n" + now1);

        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, new Locale("uk"));

        System.out.println(df.format(new Date()));
        System.out.println("test");
        System.out.printf(new Locale ("uk"), "Data: %ty\n", new Date());

        System.out.println("сравнение даты " + ((date1.getTime() > date2.getTime()) ? "date1 after date2":"date1 before date2"));
        System.out.println("сравнение даты " + date1.equals(date2));
        System.out.println(date2.before(date1));

        Calendar cal1 = new GregorianCalendar();
        Date ss1 = cal1.getTime();
        System.out.println(ss1);
        System.out.printf(new Locale("uk")," %td %tb %tY\n", cal1, cal1, cal1);
        //cal1.add(Calendar.MONTH, -1);
        //System.out.println(cal1.getTime());
        //cal1.roll(Calendar.MONTH, -10);
        System.out.println(cal1.getTime());
        System.out.println("Год: " + cal1.get(Calendar.YEAR));
        System.out.println("Месяц: " + cal1.get(Calendar.MONTH));
        System.out.println("номер недели в месяце: " + cal1.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Число: " + cal1.get(Calendar.DAY_OF_MONTH));
        System.out.println("Часы: " + cal1.get(Calendar.HOUR));
        System.out.println("Минуты: " + cal1.get(Calendar.MINUTE));
        System.out.println("Секунды: " + cal1.get(Calendar.SECOND));
        System.out.println("Миллисекунды: " + cal1.get(Calendar.MILLISECOND));
        int years = cal1.get(Calendar.DAY_OF_MONTH);
        System.out.println(years);

        System.out.println("TIMER");

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;

        dateFormat = new SimpleDateFormat();
        System.out.println("Constructor 1: " + dateFormat.format( currentDate ) );

        dateFormat = new SimpleDateFormat("dd MM YYYY");
        System.out.println("Constructor 2: " + dateFormat.format( currentDate ) );

       dateFormat = new SimpleDateFormat("dd MMMM", Locale.ENGLISH);
        System.out.println("Constructor 3: " + dateFormat.format( currentDate ) );

//        Timer timer = new Timer();
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//
//            }
//
//        };
//
//        timer.schedule(task, 0, 1000);

//        G	эра (в английской локализации - AD и BC)	н.э.
//        y	год (4-х значное число)	2012
//        yy	год (последние 2 цифры)	12
//        yyyy	год (4-х значное число)	2012
//        M	номер месяца без лидирующих нулей	2
//        MM	номер месяца (с лидирующими нулями если номер месяца < 10)	02
//        MMM	четырех буквенное сокращение месяца в русской локализации и трех буквенное - в английской (Feb)	фев
//        MMMM	полное название месяца (в английской локализации - February)	Февраль
//        w	неделя в году без лидирующих нулей	7
//        ww	неделя в году с лидирующими нулями	07
//        W	неделя в месяце без лидирующих нулей	2
//        WW	неделя в месяце с лидирующим нулем (если это необходимо)	02
//        D	день в году	38
//        d	день месяца без лидирующих нулей	7
//        dd	день месяца с лидирующими нулями	07
//        F	день недели в месяце без лидирующих нулей	1
//        FF	день недели в месяце с лидирующими нулями	01
//        E	день недели (сокращение)	Вт
//        EEEE	день недели (полностью)	вторник
//        a	AM/PM указатель	AM
//        H	часы в 24-часовом формате без лидирующих нулей	6
//        HH	часы в 24-часовом формате с лидирующим нулем	06
//        k	количество часов в 24-часовом формате	18
//        K	количество часов в 12-часовом формате	6
//        h	время в 12-часовом формате без лидирующих нулей	6
//        hh	время в 12-часовом формате с лидирующим нулем	06
//        m	минуты без лидирующих нулей	32
//        mm	минуты с лидирующим нулем	32
//        s	секунды без лидирующих нулей	11
//        ss	секунды с лидирующим нулем	11
//        S	миллисекунды	109
//        z	часовой пояс	EET
//        Z	часовой пояс в формате RFC 822	+0200
//        '	символ экранирования для текста	'Date='
//        ''	кавычка	'o''clock'




    }

}
