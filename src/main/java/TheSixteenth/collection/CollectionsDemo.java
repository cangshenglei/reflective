package TheSixteenth.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //创建ArraryList集合
        List<String> list = new ArrayList<>();
    //批量向集合中添加元素
        Collections.addAll(list,"a","b","c","d","e","f","g");

        System.out.println(list);

        Collections.reverse(list);

        Collections.shuffle(list);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


    }
}
