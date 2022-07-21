package TheFifteenth.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo04 {
    public static void main(String[] args) {
////使用多态的方式创建Collection接口实现类对象
		Collection coll = new ArrayList();

	//添加元素
	coll.add("abc");
	coll.add("def");
		coll.add(123);

		//打印集合对象
		System.out.println(coll.toString());
    }
}
