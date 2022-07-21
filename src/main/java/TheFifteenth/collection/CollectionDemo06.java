package TheFifteenth.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo06 {
    public static void main(String[] args) {
        //使用多态创建集合对象
        Collection coll = new ArrayList();

        coll.add("abc");
        coll.add("def");
        coll.add("ghi");

        Iterator iterator = coll.iterator();
        ((ArrayList) coll).add(123);
//考虑Iterator实现类对象中不知道到底存在多少个元素
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

    }
}
