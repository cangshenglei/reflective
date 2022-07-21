package TheTinth.demo04;
/**
 * @ClassName ExtendsDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月25日 10时18分
 * @Version 1.0
 *
 * 继承关系中静态成员的特点:
 *      子类可以继承父类的静态成员
 */
public class ExtendsDemo04 {
    public static void main(String[] args) {
        System.out.println(SuperClass.num);
        SuperClass.method();

        System.out.println(SubClass.num);
        SubClass.method();
        SubClass subClass = new SubClass();
        subClass.method1();

    }
}
