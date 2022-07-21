package TheTwentyFirst.init;

import org.junit.Test;

public class TestClassLoader {
    @Test
    public void test01(){
        //系统类加载器就是应用程序类加载器  ClassLoader.getSystemClassLoader()
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2

    }

    @Test
    public void test02(){
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader); //APP

        ClassLoader classLoader2 = classLoader.getParent(); //不是得到继承关系的父类，是上级类加载器
        System.out.println(classLoader2);//Ext

        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println(classLoader3); //null

    }


    @Test
    public void test03() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String"); //Boot null
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(classLoader); //null


        clazz = Class.forName("com.sun.nio.zipfs.ZipCoder"); //
        classLoader = clazz.getClassLoader();
        System.out.println(classLoader); //EXT

        clazz = Class.forName("com.atguigu.clazz.TestClass1"); //
        classLoader = clazz.getClassLoader();
        System.out.println(classLoader); //APP

        clazz = Class.forName("org.junit.Test"); //
        classLoader = clazz.getClassLoader();
        System.out.println(classLoader); //APP
    }

}
