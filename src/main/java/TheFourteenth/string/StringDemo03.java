package TheFourteenth.string;

public class StringDemo03 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "abcdefg";

        //获取字符串的长度
        System.out.println(s.length());
        System.out.println("===================");

        //在字符串的结尾处追加指定的字符串
        System.out.println(s.concat("HelloWorld"));
        System.out.println("===================");

        //根据指定索引获取字符串相应位置上的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));
        System.out.println("===================");

        //分别获取指定字符串在字符串中出现的第一次和最后一次索引
        String str = "asdfefatfdsvdsfasdfdsfasrewrfsdvdsvggrqetrtafdfdsfas3dfsdfsdf";

        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.indexOf("HelloWorld"));

        System.out.println("===================");

        //根据索引位置获取字符串中指定字符串
        System.out.println(s.substring(3));

        System.out.println(s.substring(3,6));
    }
}
