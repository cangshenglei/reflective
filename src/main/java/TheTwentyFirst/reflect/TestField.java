package TheTwentyFirst.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 使用反射操作属性（赋值+取值） 不常用
 *
 * 引用类型：
 *  snoField.set(stu,12);
 *  snoField.get(stu)
 * 基本类型
 *  snoField.setInt(stu,12)
 *  snoField.getInt(stu)
 */
public class TestField {
    @Test
    public void test01(){
        //不使用反射
        Student stu = new Student();
        stu.score = 98.0; //public 可以操作，但是不建议  赋值
        //stu.sno = 10; //private  权限限制 封装性
        //stu.setSno(10); //不是在操作属性，是在执行方法
        Double score1 = stu.score;
        System.out.println(score1); //取值
    }

    @Test
    public void test02() throws  Exception{
        //使用反射操作属性
        //1.获取类的完整路径
        String className = "com.atguigu.reflect.Student";
        // 2.根据类的完整路径获取类的Class对象
        Class<?> clazz = Class.forName(className);
        //3.使用反射创建对象
        Object stu = clazz.newInstance(); //Student stu = new Student();
        //Object stu1 = clazz.getConstructor().newInstance();
        //4.获取指定的属性
        Field scoreField = clazz.getField("score");
        Field snoField = clazz.getDeclaredField("sno");
        snoField.setAccessible(true);
        //6.给属性赋值   stu.score = 98.0;
        scoreField.set(stu,89.0);
        snoField.set(stu,12);
        //5.输出属性的值   double score1 = stu.score;
        Object score1 =  scoreField.get(stu);
        System.out.println(score1);
        System.out.println(snoField.get(stu));
        System.out.println(stu);
    }
}
