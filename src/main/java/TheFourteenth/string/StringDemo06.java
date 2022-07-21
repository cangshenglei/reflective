package TheFourteenth.string;

import java.util.Scanner;

public class StringDemo06 {
    public static void main(String[] args) {
        method02();
    }

    private static void method02() {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请键盘录入一个字符串:");
        String str = sc.next();

        //声明4个计数器变量
        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;

        //遍历数组
        for (int i = 0; i < str.length(); i++) {
            //获取当前字符
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                big++;
            } else if (c >= 'a' && c <= 'z') {
                small++;
            } else if (c >= '0' && c <= '9') {
                num++;
            } else {
                other++;
            }
        }

        //打印计数器变量
        System.out.println("大写字符:" + big + "个");
        System.out.println("小写字符:" + small + "个");
        System.out.println("数字字符:" + num + "个");
        System.out.println("其它字符:" + other + "个");

        //关闭资源
        sc.close();
    }

    private static void method01() {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请键盘录入一个字符串:");
        String str = sc.next();

        //将字符串转换为字符数组
        char[] chars = str.toCharArray();

        //声明4个计数器变量
        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;

        //遍历数组
        for (int i = 0; i < chars.length; i++) {
            //判断当前字符范围
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                big++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                small++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                num++;
            } else {
                other++;
            }
        }

        //打印计数器变量
        System.out.println("大写字符:" + big + "个");
        System.out.println("小写字符:" + small + "个");
        System.out.println("数字字符:" + num + "个");
        System.out.println("其它字符:" + other + "个");

        //关闭资源
        sc.close();
    }
}
