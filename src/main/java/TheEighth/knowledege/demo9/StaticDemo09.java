package TheEighth.knowledege.demo9;

/**
 * @ClassName StaticDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 11时27分
 * @Version 1.0
 *
 * 延迟加载(懒汉式)步骤:
 *      1.将创建唯一对象所对应类的构造器进行私有化
 *      2.在唯一对象所对应的类中声明唯一对象的变量
 *      3.为了本类之外获取该对象,进行static修饰
 *      4.为了保证数据的安全性,需要进行private修饰
 *      5.对外提供公共get()获取功能,并在第一次获取该对象的同时创建唯一对象
 */
public class StaticDemo09 {
}
