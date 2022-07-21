package TheEighth.knowledege.demo8;

/**
 * @ClassName StaticDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 10时55分
 * @Version 1.0
 *
 * 设计模式:解决某一类问题专用的解决方案
 * 框架:半成品项目
 *
 * 单例设计模式:
 *      含义:创建唯一实例的专用解决方案
 *
 * 解决方案:
 *      立即加载(饿汉式)
 *      延迟加载(懒汉式)
 *
 * 立即加载(饿汉式)步骤:
 *      1.将创建唯一对象所对应类的构造器进行私有化
 *      2.在唯一对象所对应的类中创建唯一的对象
 *      3.为了本类之外获取该类,进行static修饰
 *      4.为了保证数据的安全性,需要进行private修饰
 *      5.对外提供公共get()获取功能
 *
 */
public class StaticDemo08 {
    public static void main(String[] args) {
        CEO c1 = CEO.getCeo();

        CEO c2 = CEO.getCeo();
        CEO c3 = CEO.getCeo();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
