package TheEighth.knowledege.demo5;
/**
 * @ClassName StaticDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 09时59分
 * @Version 1.0
 *
 * 静态方法:
 *      含义:声明在类中,且含有static修饰的方法
 *      格式:
 *          修饰符 static 返回类型 方法名 () {}
 *      作用:
 *          (1)被static修饰的方法,不再归属于对象,而是归属于类,会被通过这个类创建的所有对象所共享
 *          (2)当有些类的存在不会为了创建对象的,而是为了封装功能方法,考虑如果这些方法是实例方法必须创建对象,
 *          这个对象始终会在堆内存驻留,浪费内存空间,可以将这些方法直接声明静态方法,从而可以通过类名进行调用,
 *          从而提高内存使用率,与此同时,必须将该类的构造器进行私有化
 *      调用:
 *          类名.方法名(实参);
 */
public class StaticDemo05 {
    public static void main(String[] args) {
        //创建数组工具类对象
        //ArrayUtils au = new ArrayUtils();
        //au.printArr(new int[] {11,22,33,44,55});
        //上述代码在内存中参与执行的对象有:ArrayUtils字节码文件对象,对象au,数组

        System.out.println("==========================");

        ArrayUtils.print(new int[]{11, 22, 33, 44, 55});
        //上述代码在内存中参与执行的对象有:ArrayUtils字节码文件对象,数组


    }
}