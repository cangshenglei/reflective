package TheTwentyFirst.clazz;

import org.junit.Test;

/**
 * 问题2：如何获取一个类型的Class对象
 *
 * 方式1：类名.class
 *   可以获取各种类型的Class对象
 *   编译的时候已经知道了类型  TestClass2.class
 *
 * 方式2：对象名.getClass()
 *   必须新创建对象，才可以拿到类对象
 *   编译的时候已经知道了类型
 *          TestClass2 tc2 = new TestClass2();
 *         Class clazz2 = tc2.getClass();
 *
 * 方式3：Class.forName()
 *    编译的时候知道了类型，可以用该方式，但是没有必要
 *    编译的时候不知道类型（反射），只能用该方式
 *    从配置文件中获取类的完整路径 字符串
 *   String  className="com.atguigu.entity.Dog";
 *   Class clazz = Class.forName(className);
 */
public class TestClass2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式1：类名.class
        Class clazz = TestClass2.class;
        System.out.println(clazz);

        //方式2：对象名.getClass()
        TestClass2 tc2 = new TestClass2();
        Class clazz2 = tc2.getClass();
        System.out.println(clazz2);


        //方式3：Class.forName()
        Class clazz3 = Class.forName("com.atguigu.clazz.TestClass2");
        System.out.println(clazz3);


        //方式4：通过类加载器，不常用
        Class clazz4 = ClassLoader.getSystemClassLoader().loadClass("com.atguigu.clazz.TestClass2");
        System.out.println(clazz4);

        //一个类不管创建多少个对象，类对象（Class对象）只有一个。不管通过哪种方式获取，获取的都是同一个
        System.out.println(clazz==clazz2); //true
        System.out.println(clazz==clazz3); //true
        System.out.println(clazz==clazz4); //true
    }
    @Test
    public void test02(){
        int[] arr1 = {1,2,3,4,5}; //int
        int[] arr2 = {10,34,5,66,34,22}; //int
        int[][] arr3 = {{1,2,3,4},{4,5,6,7}}; //int[]
        String[] arr4 = {"hello","world"}; //String

        //获取数组的类对象
        Class c1 = arr1.getClass();
        Class c2 = arr2.getClass();
        Class c3 = arr3.getClass();
        Class c4 = arr4.getClass();
        Class c5 = int[].class;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        //维度相同，元素类型相同，不管元素个数是否相同，为同一个Class对象
        System.out.println(c1 == c2); //true
        System.out.println(c1== c5); //true
        System.out.println(c1 == c3); //false
        System.out.println(c1 == c4); //false
        System.out.println(c3 == c4); //false
        //获取数组元素的类型getComponentType()
        System.out.println(c1.getComponentType()); //int
        System.out.println(c2.getComponentType()); //int
        System.out.println(c3.getComponentType()); //class [I
        System.out.println(c4.getComponentType()); //class java.lang.String
    }
}
