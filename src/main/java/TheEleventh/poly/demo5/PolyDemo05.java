package TheEleventh.poly.demo5;

public class PolyDemo05 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.method();
        System.out.println("=================");

        //子类new子类
        SubClass subClass = new SubClass();
        subClass.method();
        System.out.println("=================");

        //父类new子类
        SuperClass sc = new SubClass();
        sc.method();
    }
}
