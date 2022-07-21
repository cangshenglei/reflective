package TheTwentyFirst.clazz;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * 问题3：类对象中存储了什么信息，如何拿到
 */
public class TestClass3 {
    //基本信息
    @Test
    public void test01() {
        //获取一个类的Class对象（四种方式）
        Class<String> clazz = String.class;

        //从Class对象中获取基本信息
        System.out.println(clazz.getName()); //java.lang.String
        System.out.println(clazz.getSimpleName());//String
        System.out.println(clazz.getPackage()); //java.lang Package
        System.out.println(clazz.getSuperclass());//java.lang.Object
        System.out.println(Arrays.toString(clazz.getInterfaces()));//java.io.Serializable, Comparable<String>, CharSequence
        System.out.println(clazz.getModifiers()); //修饰符Modifier
        System.out.println(Modifier.toString(clazz.getModifiers()));
    }
    //成员变量信息
    @Test
    public void test02() throws NoSuchFieldException {
        //获取一个类的Class对象（四种方式）
        Class<String> clazz = String.class;

        //从Class对象中获取成员变量信息
        //Field[] fields = clazz.getFields(); //获取所有public成员变量
//        Field [] fields = clazz.getDeclaredFields(); //获取所有的成员变量
//        for(Field field:fields){
//            System.out.println(field);
//        }

        //Field field = clazz.getField("CASE_INSENSITIVE_ORDER"); //获取指定的public的成员变量
        Field field = clazz.getDeclaredField("value"); //获取所有修饰符的指定成员变量
        System.out.println(field.toString());
        System.out.println(field.getName());//value
        System.out.println(field.getType());//char[]
        System.out.println(field.getModifiers());//
        System.out.println(Modifier.toString(field.getModifiers()));//private final
    }
    //构造方法信息
    @Test
    public void test03() throws NoSuchMethodException {
        //获取一个类的Class对象（四种方式）
        Class<String> clazz = String.class;

        //从Class对象中获取构造方法信息
        //Constructor<?>[] constructors = clazz.getConstructors();//所有的public构造方法
//        Constructor<?>[] constructors = clazz.getDeclaredConstructors();//所有的构造安抚
//
//        for(Constructor constructor :constructors){
//            System.out.println(constructor);
//        }
        Constructor constructor = clazz.getConstructor(char[].class, int.class, int.class);
        //Constructor constructor = clazz.getConstructor(char[].class, int.class, int.class,String.class);
        System.out.println(constructor);
        System.out.println(constructor.getName());
        System.out.println(constructor.getModifiers());
        System.out.println(constructor.getParameterCount());
        System.out.println(Arrays.toString(constructor.getParameterTypes())); //参数列表
    }
    //成员方法信息
    @Test
    public void test04() throws NoSuchMethodException {
        //获取一个类的Class对象（四种方式）
        Class<String> clazz = String.class;
        //从Class对象中获取成员方法信息
//        clazz.getMethods();
//        clazz.getDeclaredMethods();
//        clazz.getMethod();
//        clazz.getDeclaredMethod();
        //Method[] methods = clazz.getMethods(); //所有的public方法，和从上级类中继承的public方法
//        Method[] methods = clazz.getDeclaredMethods(); //当前类所有的方法，不包括从上级类继承的public方法
//        for(Method method: methods){
//            System.out.println(method);
//        }
        // static int indexOf(char[] source, int sourceOffset, int sourceCount,
        //            String target, int fromIndex)
        //Method method = clazz.getMethod("indexOf",String.class);
        Method method = clazz.getDeclaredMethod("indexOf",char[].class,int.class,int.class,String.class,int.class);
        System.out.println(method);
        System.out.println(method.getReturnType()); //返回值类型


    }
}
