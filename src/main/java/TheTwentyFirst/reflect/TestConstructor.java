package TheTwentyFirst.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射创建对象
 */
public class TestConstructor {
    /*
    无参数构造方法
     */
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //不使用反射
        Student stu = new Student();
        System.out.println(stu);

        //使用反射
        //1.解析配置文件获取类的完整路径
        String className ="com.atguigu.reflect.Student";
        //2.得到该类的Class对象
        Class<?> clazz = Class.forName(className);
        //3.从Class对象中得到该类的无参数构造方法
        Constructor<?> constructor = clazz.getConstructor();
        //4.使用Constructor创建对象（反射）
        Object stu2 = constructor.newInstance();
        System.out.println(stu2);


    }

    @Test
    public void test012() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //不使用反射
        Student stu = new Student();
        System.out.println(stu);

        //使用反射
        //1.解析配置文件获取类的完整路径
        String className ="com.atguigu.reflect.Student";
        //2.得到该类的Class对象
        Class<?> clazz = Class.forName(className);
//        //3.从Class对象中得到该类的无参数构造方法
//        Constructor<?> constructor = clazz.getConstructor();
//        //4.使用Constructor创建对象（反射）
//        Object stu2 = constructor.newInstance();
        //两步合一步
        //Object stu2 = clazz.getConstructor().newInstance();
        Object stu2 = clazz.newInstance();
        System.out.println(stu2);


    }
    /*
       有参数构造方法
       <bean id="an" class="com.atguigu.entity.Dog">
            <property name="nickName" value="旺财"></property>
            <property name="color" value="黑色"></property>
        </bean>
        */
    @Test
    public void test02() throws Exception{
        //不使用反射
        Student stu = new Student(1,"zhangsan",100.0);
        System.out.println(stu);
        //使用反射
        //1.解析配置文件获取类的完整路径
        String className ="com.atguigu.reflect.Student";
        //2.得到该类的Class对象
        Class<?> clazz = Class.forName(className);
        //3.从Class对象中得到该类的有参数构造方法
        Constructor constructor = clazz.getConstructor(Integer.class,String.class,Double.class);
        //4.使用Constructor创建对象（反射）
        Object stu2 = constructor.newInstance(2,"lisi",100.0);
        System.out.println(stu2);
    }
    /*
       private构造方法
       问题1：
       java.lang.NoSuchMethodException:
       com.atguigu.reflect.Student.<init>(java.lang.Integer, java.lang.String)
       原因：构造方法不存在，或者是非public
       解决：clazz.getDeclaredConstructor(Integer.class,String.class);

    问题2：java.lang.IllegalAccessException:
    Class com.atguigu.reflect.TestConstructor can not access a member of
    class com.atguigu.reflect.Student with modifiers "private"
    原因：private的方法，可以获取到，和可以执行是两回事
    解决： constructor.setAccessible(true); //突破权限的限制，即使private的也可以调用


        */
    @Test
    public void test03() throws Exception{
        //不使用反射 private 无法使用
        //Student stu = new Student(1,"zhangsan");

        //使用反射
        //1.解析配置文件获取类的完整路径
        String className ="com.atguigu.reflect.Student";
        //2.得到该类的Class对象
        Class<?> clazz = Class.forName(className);
        //3.从Class对象中得到该类的有参数构造方法
        //Constructor constructor = clazz.getConstructor(Integer.class,String.class);
        Constructor constructor = clazz.getDeclaredConstructor(Integer.class,String.class);
        //4.使用Constructor创建对象（反射）
        constructor.setAccessible(true); //突破权限的限制，即使private的也可以调用
        Object stu2 = constructor.newInstance(3,"wangwu");
        System.out.println(stu2);

    }
}
/**
 反射优势：功能强大
 1.编译的时候不知道类的信息，需要靠运行时获取的信息才知道。此时只能使用反射
 2.可以突破权限的限制，即使private也可以访问
 反射缺点：
 1.语句繁琐，可读性差，执行速度慢
 2.可以突破权限的限制，即使private也可以访问

 */