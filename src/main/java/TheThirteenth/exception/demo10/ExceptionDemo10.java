package TheThirteenth.exception.demo10;

import java.util.Scanner;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        method03();
    }

    public static void method03() {
        //声明Scanner扫描器对象变量
        Scanner sc = null;

        try {
            //创建Scanner对象
            sc = new Scanner(System.in);

            //进行键盘录入并扫描
            System.out.println("请键盘录入一个整数:");
            int num = sc.nextInt();

            //打印变量num
            System.out.println("num = " + num);
        } catch (Exception e) {

        } finally {
            //关闭资源
            if (sc != null) {
                System.out.println("关闭资源");
                sc.close();
            }
        }
    }

    public static void method02() {
        //声明Scanner扫描器对象变量
        Scanner sc = null;

        try {
            //创建Scanner对象
            sc = new Scanner(System.in);

            //进行键盘录入并扫描
            System.out.println("请键盘录入一个整数:");
            int num = sc.nextInt();

            //打印变量num
            System.out.println("num = " + num);

            //关闭资源
            System.out.println("关闭资源");
            sc.close();
        } catch (Exception e) {
            //关闭资源
            if (sc != null) {
                System.out.println("关闭资源");
                sc.close();
            }
        }
    }

    public static void method01() {
        //创建Scanner扫描器对象
        Scanner sc = new Scanner(System.in);

        //进行键盘录入并扫描
        System.out.println("请键盘录入一个整数:");
        int num = sc.nextInt();

        //打印变量num
        System.out.println("num = " + num);

        //关闭资源
        System.out.println("关闭资源");
        sc.close();
    }
}