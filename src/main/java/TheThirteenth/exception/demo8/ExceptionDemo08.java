package TheThirteenth.exception.demo8;

import java.io.IOException;

public class ExceptionDemo08 {
    public static void main(String[] args) {
        System.out.println("开始");

        method(2);

        System.out.println("结束");
    }

    private static void method(int num) {
        if (num == 1) {
            try {
                throw new IOException("自定义IO异常对象");
            } catch (IOException e) {
                System.out.println("IO异常的解决方案");
            }
        }
    }

}
