package TheThirteenth.date;

import java.time.LocalDateTime;
import java.time.Month;

public class DateDemo04 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);


    }
}
