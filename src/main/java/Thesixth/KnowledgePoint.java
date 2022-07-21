package Thesixth;

public class KnowledgePoint {
/**
 * @ClassName ArrayDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月19日 11时08分
 * @Version 1.0
 *
 * 方法传参的特点:
 *      当方法的形参是基本类型时,
 *          1.传递的内容是基本类型的数据值
 *          2.形式参数(形参)数据值的改变不会影响实际参数(实参)的数据值
 *      当方法的形参是引用类型时,
 *          1.传递的内容是引用类型的地址值
 *          2.形式参数(形参)地址值的改变不会影响实际参数(实参)的地址值
 *          3.形式参数(形参)地址值不改变,形式参数(形参)地址值中元素值的改变会影响实际参数(实参)地址值中的元素值
 *
 */

/**
 * @ClassName ArrayDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月19日 11时33分
 * @Version 1.0
 *
 * 可变参数(JDK5.0中的新特性)
 *      格式:
 *          数据类型... 可变参数名
 *      好处:
 *          实参可以根据实际需求给其传递,最少可以传递0个实参,最多传递无数个实参
 *      含义:
 *          其实就是将实参作为元素进行静态初始化的数组
 */


    /**
     * @ClassName ArrayDemo10
     * @Description 此类用于演示功能
     * @Author Shark
     * @DateTime 2022年02月19日 11时40分
     * @Version 1.0
     * <p>
     * 可变参数的注意事项:
     * 1.当声明一个方法时,方法的形参列表除了可变参数外还存在其它参数,需要将可变参数声明在形参列表中的最后位置,否则编译报错
     * 2.当声明一个方法时,方法的形参列表中最多只能含有一个可变参数,否则编译报错
     */

    /**
     * @ClassName ArrayDemo13
     * @Description 此类用于演示功能
     * @Author Shark
     * @DateTime 2022年02月19日 15时24分
     * @Version 1.0
     *
     * 数组的动态操作:扩容,插入,删除
     */


    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        int num = getNum(arr, 0);
        System.out.println("num = " + num);
    }

    public static void method(int... var) {
        System.out.println(var);//[I@1b6d3586
        System.out.println(var.length);
    }

    public static int getNum(int[] arr, int index) {
        //进行参数arr的非空校验
        if (arr == null) {
            System.out.println("数组为空");
            return 0;
        }

        //进行非法索引校验
        if (index < 0 || index >= arr.length) {
            System.out.println("索引错误");
            return 0;
        }
        int num = arr[index];
        return num;
    }

}