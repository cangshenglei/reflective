package TheThirteenth.exception.demo6;

import java.io.IOException;

public class ExceptionDemo06 {
    public static void main(String[] args) throws IOException {
        System.out.println("开始");

        throw new IOException("自定义IO异常对象");

    }
}