package TheSixteenth.set;

import java.util.HashSet;

public class SetDemo03 {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();

        //创建String对象
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("通话");
        set.add("重地");
        System.out.println(set);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());
        System.out.println(set);
    }
}
