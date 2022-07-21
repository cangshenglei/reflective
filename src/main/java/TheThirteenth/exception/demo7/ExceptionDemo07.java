package TheThirteenth.exception.demo7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo07 {

    public static void main(String[] args) throws IOException {
        SubClass subClass = new SubClass();
       ExceptionDemo07.method(2,1);
    }
    public static void method (int a , int b) throws IOException {
        if (a == 1) {
            throw new FileNotFoundException("自定义文件找不到异常对象");
        }

        if (b == 1) {
            throw new IOException("自定义IO异常对象");
        }
    }



}
