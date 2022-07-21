package TheFourteenth.string;

public class StringDemo01 {
    public static void main(String[] args) {
        //通过字符串字面值常量进行创建
        String str1 = "abcdefg";
        System.out.println("str1 = " + str1);
        //通过无参构造器创建对象
        String s = new String();//类似于"",二者有本质的不同
        System.out.println("str="+s);
        //根据应用平台的编码和字节数组创建对象
        byte[] bytes = {97,98,99,100,101,102,103};
        String str3 = new String(bytes);
        System.out.println("str3 = " + str3);
        //根据应用平台的编码和指定范围字节数组创建对象
        String s1 = new String(bytes, 2, 3);
        System.out.println(s1);
        //根据字符数组创建对象
        char[] chars = {'a','b','c','d','e','f','g'};
        String str5 = new String(chars);
        System.out.println("str5 = " + str5);
        //根据指定范围字符数组创建对象
        String str6 = new String(chars,3,3);
        System.out.println("str6 = " + str6);
//根据另外一个字符串创建对象
        String str7 = new String("abcdefg");
        System.out.println("str7 = " + str7);




/*        str1 = abcdefg
        str=
                str3 = abcdefg
        cde
                str5 = abcdefg
        str6 = def
        str7 = abcdefg*/


    }
}
