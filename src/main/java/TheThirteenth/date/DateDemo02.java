package TheThirteenth.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) throws ParseException {
        format();
        parse();
    }

    private static void parse() throws ParseException {
        String str = "2022年03月01日 15时14分21秒652毫秒";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

        Date parse = simpleDateFormat.parse(str);

        System.out.println(parse);
    }

    private static void format() {

        Date date = new Date();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        String format = simpleDateFormat.format(date);

        System.out.println(format);


    }
}
