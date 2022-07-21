package TheThirteenth.date;

import java.util.Calendar;

public class DateDemo03 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        System.out.println(instance);

        int i = instance.get(Calendar.YEAR);
        int i1 = instance.get(Calendar.MONTH);
        int i2 = instance.get(Calendar.DAY_OF_MONTH);

        System.out.println(i);


    }
}
