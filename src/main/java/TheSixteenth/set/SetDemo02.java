package TheSixteenth.set;

import java.util.HashSet;

public class SetDemo02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        while (set.size() < 12) {
            set.add("元素" + (int)(Math.random() *1000 + 1));
        }

        System.out.println(set);

        //添加元素
        set.add("元素666");

        System.out.println(set);
        System.out.println(Math.random());
    }
}
