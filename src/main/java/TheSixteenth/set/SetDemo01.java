package TheSixteenth.set;


import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();

        set.add(new String("abc"));
        set.add(new String("def"));
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add("abc");

        System.out.println(set);

    //    [abc, def]
//Set集合内部不存重复的数据
    }
}
