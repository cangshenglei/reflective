package TheTwentyFirst.clazz;

import java.lang.annotation.ElementType;

/**
 * 问题1：Java的哪些类型可以有Class对象
 *
 * 所有类型都有Class对象
 * 基本数据类型
 * 类
 * 接口
 * 注解
 * 枚举
 *
 * 引入泛型后，出现了更多的类型，这些类型不能用Class表示，用扩展类型表示。
 * Class是Type接口的实现类
 * 其他都是Type的子接口
 *
 *
 */
public class TestClass1 {
    public static void main(String[] args) {
        //（1）基本数据类型和void
        Class c1 = int.class;
        Class c2 = void.class;

        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2);
        //（2）类和接口
        Class c3 = String.class;
        Class c4 = Comparable.class;
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        //（3）枚举
        Class c5 = ElementType.class;
        System.out.println("c5 = " + c5);

        //（4）注解
        Class c6 = Override.class;
        System.out.println("c6 = " + c6);

        //（5）数组
        Class c7 = int[].class;
        Class c9 = String[].class;
        Class c8 = int[][].class;
        System.out.println("c7 = " + c7);
        System.out.println("c8 = " + c8);
        System.out.println("c9 = " + c9);
    }
}
