package TheFifteenth.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo05 {
    public static void main(String[] args) {
        //使用多态创建集合对象
        Collection coll = new ArrayList();

        coll.add("abc");
        coll.add("def");
        coll.add("ghi");

        //依据集合获取迭代器对象
        Iterator it = coll.iterator();

        //因为Iterator不知道存在多少个元素
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
