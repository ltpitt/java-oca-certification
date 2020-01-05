package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDateAndTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2030, Month.JANUARY, 10);
        System.out.println(date);
        date = date.plusDays(5).plusMonths(2);
        System.out.println(date);

        LocalTime time = LocalTime.of(10,30);
        System.out.println(time);
        time = time.plusHours(2).plusMinutes(20);
        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
        System.out.println(localDateTime);


        // before java 8
        Date myDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.MONTH, 2);
        myDate = calendar.getTime();
        System.out.println(myDate);

        // exam tricks
        LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
        ld.plusDays(10); // return result is ignored
        System.out.println(ld);

//        ld.plusMinutes(10);

        LocalTime lt = LocalTime.of(12,45);
//        lt.addDays(3);
    }
}
