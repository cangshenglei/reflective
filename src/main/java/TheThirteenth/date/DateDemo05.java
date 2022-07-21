package TheThirteenth.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDemo05 {
    public static void main(String[] args) {
        format();
        parse();

    }

    private static void format() {
        //1.获取第三代日期时间类对象
        LocalDateTime ldt = LocalDateTime.now();

        //2.获取第三代格式化和解析对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        //3.进行格式化操作
        String format = dtf.format(ldt);

        System.out.println(format);
    }

    private static void parse() {
        String str = "2022年03月01日 15时14分21秒652毫秒";

        //2.获取第三代格式化和解析对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

        //3.进行解析操作
        LocalDateTime parse = LocalDateTime.parse(str, dtf);

        System.out.println(parse);
    }





}
