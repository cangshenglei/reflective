package TheTwentyFirst.init;
/*
（1）运行主方法所在的类，要先完成类初始化，再执行main方法
（2）子类初始化时，发现它的父类还没有初始化的话，那么先初始化父类
（3）第一次使用某个类型就是在new它的对象，此时这个类没有初始化的话，先完成类初始化再做实例初始化
（4）调用某个类的静态成员（类变量和类方法），此时这个类没有初始化的话，先完成类初始化
（5）通过反射操作某个类时，如果这个类没有初始化，也会导致该类先初始化
 */
class Father{
    static{
        System.out.println("main方法所在的类的父类(1)");//初始化子类时，会初始化父类
    }
}

public class ClassInitialize extends Father{
    static{
        System.out.println("main方法所在的类(2)");//主方法所在的类会初始化
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        new A();//第一次使用A就是创建它的对象，会初始化A类
//        new A();
//        new A();
//
        B.test();//直接使用B类的静态成员会初始化B类
        B.test();

        Class clazz = Class.forName("com.atguigu.init.C");//通过反射操作C类，会初始化C类
    }
}
class A{
    static{
        System.out.println("A类初始化");
    }
}
class B{
    static{
        System.out.println("B类初始化");
    }
    public static void test(){
        System.out.println("B类的静态方法");
    }
}
class C{
    static{
        System.out.println("C类初始化");
    }
}