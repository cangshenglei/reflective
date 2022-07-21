package TheFourteenth.string;

public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("ABC");
        String s4 = new String("abd");
        String s = "abcdefg";

        //判断两个字符串内容是否相等,且区别大小写
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println("======================");

        //判断两个字符串内容是否相等,且不区分大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println("======================");

        //判断字符串中是否包含指定的字符串
        System.out.println(s.contains("def"));
        System.out.println(s.contains("HelloWorld"));

        System.out.println("======================");

        //判断字符串是否以指定的后缀最为结尾
        System.out.println(s.endsWith("defg"));
        System.out.println(s.endsWith("HelloWorld"));

        System.out.println("======================");

        //判断字符串的长度是否为0
        System.out.println("".isEmpty());
        System.out.println(s.isEmpty());

        System.out.println("======================");

        //判断字符串是否以指定的前缀作为开始
        System.out.println(s.startsWith("abc"));
        System.out.println(s.startsWith("HelloWorld"));

        System.out.println("======================");

        //判断指定范围的字符串是否以指定的前缀最为开始
        System.out.println(s.startsWith("def",3));//abcdefg
        System.out.println(s.startsWith("abc",3));
    }
}
