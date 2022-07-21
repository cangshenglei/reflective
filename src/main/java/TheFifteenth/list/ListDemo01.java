package TheFifteenth.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        //使用多态方式创建lisy集合对象
        List<String> list = new ArrayList<>();

        list.add("1");
        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //将指定元素插入集合中的指定位置
        list.add(1,"HelloWorld");
        System.out.println(list);


        //根据索引获取指定位置上的元素
        System.out.println(list.get(1));

        //获取指定元素在集合中出现的第一次和最后一次索引
        System.out.println(list.indexOf("HelloWorld"));
        System.out.println(list.lastIndexOf("HelloWorld"));

        //根据指定的索引位置进行元素的删除
        list.remove(1);
        System.out.println(list);

        //使用指定元素替换指定索引位置上的元素
        list.set(1, "HelloWorld");
        System.out.println(list);
        System.out.println("----------");

        List<String> strings = list.subList(0,2);
        System.out.println(strings);


    }
}
