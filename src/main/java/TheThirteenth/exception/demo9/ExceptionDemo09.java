package TheThirteenth.exception.demo9;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo09 {
    public static void main(String[] args) {
        method03(1,1);
    }

    public static void method03 (int a , int b) {
        try {
            if (a == 1) {
                throw new FileNotFoundException("自定义文件找不到异常对象");
            }

            if (b == 1) {
                throw new IOException("自定义IO异常对象");
            }
        } catch (IOException e) {
            System.out.println("IO异常对象的处理方案");
        }
    }

    public static void method02 (int a , int b) {
        try {
            if (a == 1) {
                throw new FileNotFoundException("自定义文件找不到异常对象");
            }

            if (b == 1) {
                throw new IOException("自定义IO异常");
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常对象的处理方案");
        } catch (IOException e) {
            System.out.println("IO异常对象的处理方案");
        }
    }

    public static void method01 (int a , int b) {
        if (a == 1) {
            try {
                throw new FileNotFoundException("自定义文件找不到异常对象");
            } catch (FileNotFoundException e) {
                System.out.println("文件找不到异常对象的处理方案");
            }
        }

        if (b == 1) {
            try {
                throw new IOException("自定义IO异常");
            } catch (IOException e) {
                System.out.println("IO异常对象的处理方案");
            }
        }
    }

    public static void method (int a , int b) throws IOException{
        if (a == 1) {
            throw new FileNotFoundException("自定义文件找不到异常对象");
        }

        if (b == 1) {
            throw new IOException("自定义IO异常");
        }
    }
}