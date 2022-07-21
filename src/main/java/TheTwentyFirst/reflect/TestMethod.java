package TheTwentyFirst.reflect;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 使用反射执行方法
 */
public class TestMethod {
    //无参数无返回值
    @Test
    public void test01() throws Exception {
        //不用反射
//        Student stu = new Student();
//        stu.shout();

        //使用反射
        //1.获取类的完整路径字符串
        String className ="com.atguigu.reflect.Student";
        //2.根据类的完整路径字符串获取Class对象
        Class clazz = Class.forName(className);

        //3.使用反射创建对象
        Object stu = clazz.getConstructor().newInstance();

        //4.从Class中获取指定的方法
        Method method = clazz.getMethod("shout");
        //5.使用反射执行方法 stu.shout();
        method.invoke(stu);
    }


    //有参数有返回值
    @Test
    public void test02() throws Exception{
        //不用反射
//        Student stu = new Student();
//        int result = stu.add(10, 20);
//        System.out.println(result);
        //使用反射
        //1.获取类的完整路径字符串
        String className ="com.atguigu.reflect.Student";
        //2.根据类的完整路径字符串获取Class对象
        Class clazz = Class.forName(className);

        //3.使用反射创建对象
        Object stu = clazz.getConstructor().newInstance();

        //4.从Class中获取指定的方法
        Method method = clazz.getMethod("add",int.class,int.class);
        //5.使用反射执行方法 stu.shout();
        Object result = method.invoke(stu,100,200);
        System.out.println(result);
    }

    //静态方法
    @Test
    public void test03() throws  Exception{
        //不用反射
//        Student stu = new Student();
//        stu.sleep();
        Student.sleep();

        //使用反射
        //1.获取类的完整路径字符串
        String className ="com.atguigu.reflect.Student";
        //2.根据类的完整路径字符串获取Class对象
        Class clazz = Class.forName(className);
//        //3.使用反射创建对象
//        Object stu = clazz.getConstructor().newInstance();

        //4.从Class中获取指定的方法
        Method method = clazz.getMethod("sleep");
        //5.使用反射执行方法 stu.shout();
        method.invoke(null); //静态方法，对象名写出null

    }



}
