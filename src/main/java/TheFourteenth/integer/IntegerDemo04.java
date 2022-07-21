package TheFourteenth.integer;

public class IntegerDemo04 {
    public static void main(String[] args) {
        //基本==>字符串1:字符串连接符
        String str1 = 123 + "";//字符串连接符在内存中相当一个new
        //基本==>字符串2:通过包装类型的实例方法toString()
        String s = Integer.valueOf(123).toString();
         //基本==>字符串3:通过包装类型的静态方法toString()
        String s1 = Integer.toString(123);
//基本==>字符串4:通过String的静态方法valueOf()
        String s2 = String.valueOf(213);

        //字符串==>基本1:包装类型的构造器,再进行自动拆箱
        int  integer = new Integer("134");
        //字符串==>基本2:包装类型的静态方法parseXxx()
        int num02 = Integer.parseInt("678");

    }
}
