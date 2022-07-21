package TheFifteenth.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo08 {
    public static void main(String[] args) {
//使用多态创建集合对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("abc");
        coll.add("def");
        coll.add("ghi");

        for (Object o : coll) {
            System.out.println(o);
        }

        System.out.println("==============================");

        int[] arr = {11,22,33};

        for (int i : arr) {
            System.out.println(i);
        }


    }
}
