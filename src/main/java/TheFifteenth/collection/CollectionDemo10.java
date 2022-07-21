package TheFifteenth.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CollectionDemo10 {
    public static void main(String[] args) {

        //使用多态创建集合对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("abc");
        coll.add("def");
        coll.add("ghi");

        //获取collection集合的stream对象
        Stream stream = coll.stream();

        stream.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });


    }
}
