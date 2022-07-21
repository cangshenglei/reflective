package TheFifteenth.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo03 {
    public static void main(String[] args) {
    //使用多态的方式创建list集合对象
        List<String> list = new ArrayList<>();
        list.add("100元");
        list.add("100元");
        list.add("100元");
        list.add("50元");
        list.add("10元");


        //
        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String next = it.next();

            if ("100元".equals(it)){

                it.remove();
            }
        }

        System.out.println(list);
    }
}
