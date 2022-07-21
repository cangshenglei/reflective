package TheEighth.knowledege.demo7;

/**
 * @ClassName StaticDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 10时30分
 * @Version 1.0
 *
 * 静态代码块:
 *      位置:成员位置
 *      格式:
 *          static {
 *
 *          }
 *      作用:
 *          1.类的初始化笔试面试题(暂不涉及)
 *          2.给静态常量进行初始化(暂不涉及)
 *          3.封装工具类(暂不涉及)
 *      特点:
 *          1.静态代码块是随着类的加载而加载,而且只加载唯一的一次
 *          2.在静态代码块中不可以使用实例成员
 *          3.在静态代码块中不可以使用this关键字
 *
 */
public class StaticDemo07 {
    public static void main(String[] args) {
        new Var();
        new Var();
    }
}