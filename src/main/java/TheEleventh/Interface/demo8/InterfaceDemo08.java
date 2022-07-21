package TheEleventh.Interface.demo8;

/**
 * @ClassName InterfaceDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时43分
 * @Version 1.0
 *
 * 接口中的私有方法(JDK9.0)
 *      格式:
 *          针对默认方法的抽取私有方法的格式
 *              private 返回类型 方法名 () {}
 *          针对静态方法的抽取私有方法的格式
 *              private static 返回类型 方法名 () {}
 */
public class InterfaceDemo08 {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
SuperInterface.method();
}}
