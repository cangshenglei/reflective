package TheFifteenth.collection;

import java.util.ArrayList;

public class CollectionDemo14 {
    public static void main(String[] args) {
        //创建mylisy对象
        MyList myList = new MyList();

        //创建5个集合对象
        ArrayList<Object> obj = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        ArrayList<A> a = new ArrayList<>();
        ArrayList<B> b = new ArrayList<>();
        ArrayList<C> c = new ArrayList<>();

        myList.method(obj);
        myList.method(str);
        myList.method(a);
        myList.method(b);
        myList.method(c);

        System.out.println("---------------");
        //调用show();
        //myList.show(obj);//错误
        //myList.show(str);//错误
        //myList.show(a);//错误
        myList.show(b);
        myList.show(c);
        System.out.println("==========");
        myList.change(obj);
        //myList.change(str);//错误
        myList.change(a);
        myList.change(b);
        //myList.change(c);//错误

    }
}
