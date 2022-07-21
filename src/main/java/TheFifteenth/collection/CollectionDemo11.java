package TheFifteenth.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo11 {
    public static void main(String[] args) {
method2();
    }
        private static void method2(){
            ArrayList<String> coll = new ArrayList<>();
            //添加学生姓名
            coll.add("张小芳");
            coll.add("安小妮");
            coll.add("李小朦");
            coll.add("崔小荣");
            coll.add("张小弛");
            coll.add("叶小玲");
            coll.add("钟小霞");
            for (String s : coll) {
                if (s.startsWith("张")){
                    System.out.println(s);
                }
            }

        }

    private static void method01() {
        //创建存储全班姓名的集合对象
        Collection coll = new ArrayList();

        //添加学生姓名
        coll.add("张小芳");
        coll.add("安小妮");
        coll.add("李小朦");
        coll.add("崔小荣");
        coll.add(123);
        coll.add("张小弛");
        coll.add("叶小玲");
        coll.add("钟小霞");

        //使用增强for进行遍历
        for (Object o : coll) {
            if (o instanceof String) {
                //将集合中的元素进行向下转型
                String name = (String)o;

                //判断是否是姓张的同学
                if (name.startsWith("张")) {
                    System.out.println(name);
                }
            }
        }
    }



    }


