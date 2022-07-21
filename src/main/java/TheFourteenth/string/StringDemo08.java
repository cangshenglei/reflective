package TheFourteenth.string;

public class StringDemo08 {
    public static void main(String[] args) {
        String str = "abc";
        String helloWorld = str.concat("HelloWorld");
        System.out.println(str);
        System.out.println(helloWorld);

        System.out.println("=======================");

        StringBuilder sb = new StringBuilder();

        System.out.println(sb);

        //在字符串的结尾处进行追加
        sb.append("Hello");
        sb.append("World");

        System.out.println(sb);

        System.out.println("=======================");

        //在指定的位置插入指定内容
        sb.insert(5,"abc");
        System.out.println(sb);

        System.out.println("=======================");

        //针对指定的字符序列进行反转
        sb.reverse();
        System.out.println(sb);
    }
}
