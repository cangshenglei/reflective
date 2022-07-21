package TheFourteenth.string;

import java.util.Arrays;

public class StringDemo04 {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "尚硅谷";

        //将字符串转换为字符数组
        System.out.println(Arrays.toString(s1.toCharArray()));
        System.out.println(Arrays.toString(s1.toCharArray()));
        System.out.println(Arrays.toString(s2.toCharArray()));
        System.out.println("===========================");

        //将字符串根据平台编码转换为字节数组
        System.out.println(Arrays.toString(s1.getBytes()));
        System.out.println(Arrays.toString(s1.getBytes()));
        System.out.println(Arrays.toString(s2.getBytes()));
        System.out.println("===========================");

        //使用指定的字符串替换原来字符串内容
        System.out.println(s1.replace("def","HelloWorld"));
        System.out.println("===========================");

        //将字符串内容转换为小写
        System.out.println("HelloWorld".toLowerCase());

        //将字符串内容转换为大写
        System.out.println("HelloWorld".toUpperCase());
    }
}
