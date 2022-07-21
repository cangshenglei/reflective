package TheFifteenth.collection;

import java.util.ArrayList;

public class CollectionDemo03 {
    public static void main(String[] args) {
        //使用多态的方式创建Collection接口实现类对象
        ArrayList arrayList = new ArrayList();

        //
        System.out.println(arrayList);

        arrayList.add("233");
        arrayList.add("def");
        arrayList.add(123);

        System.out.println(arrayList);

        //移除集合中所有的元素
        arrayList.clear();

        //打印集合对象
        System.out.println(arrayList);

        //判断集合中是否不存在元素
        System.out.println(arrayList.isEmpty());


        arrayList.add("233");
        arrayList.add("def");
        arrayList.add(123);


        System.out.println(arrayList.size());


    }
}
