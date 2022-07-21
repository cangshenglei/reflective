package TheFifteenth.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ListDemo02 {
    public static void main(String[] args) {
        //使用多态创建list集合对象
        List<String> list = new ArrayList<>();
        //添加元素
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("伊戈达拉");
        list.add("马尔扎哈");

        //遍历方式1:迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------");

        //遍历方式2:增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");
        //遍历方式3:foreach()
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("=========================");
        //遍历方式4:stream流
        Stream<String> stream = list.stream();
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("=========================");


        //遍历方式5:特有迭代器
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
        System.out.println("=========================");
        //遍历方式6,普通for
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
