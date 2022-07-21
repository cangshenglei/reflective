package TheThirteenth.date;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        Date date1 = new Date();
        System.out.println(date1);


        //创建Date对象
        Date date2 = new Date(0L);
        System.out.println(date2);
    }

}
