package TheEleventh.poly.demo4;

public class PolyDemo04 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println(superClass.num);
        System.out.println("====================");
        SubClass subClass = new SubClass();
        System.out.println(subClass.num);
        System.out.println("====================");
        SuperClass subClass1 = new SubClass();
        System.out.println(((SubClass) subClass1).num);
        System.out.println("========================================");
        //变量的初始化值是多少,取决于"数据类型"

        int i = 'a';
        System.out.println(i);

        char c = 97;
        System.out.println(c);
    }
}
