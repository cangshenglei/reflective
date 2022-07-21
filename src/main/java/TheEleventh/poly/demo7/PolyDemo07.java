package TheEleventh.poly.demo7;

public class PolyDemo07 {
    public static void main(String[] args) {
        //1,使用接口实现类对象的方式调用method()
        Utils.method(new SubClass());
        System.out.println("==============================");

        //2,使用匿名内部类的方式调用method();
        Utils.method(new SuperInterface() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        });
        System.out.println("==============================");

        //3,使用lamadba表达式的方法调用method()
        Utils.method(str -> System.out.println(str));
        System.out.println("==============================");

        //4,使用方法引用的方式调用emthod()
        Utils.method(System.out::println);


    }
}
