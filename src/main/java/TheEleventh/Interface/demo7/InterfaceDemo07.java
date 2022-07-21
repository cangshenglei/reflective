package TheEleventh.Interface.demo7;

/**
 * @ClassName InterfaceDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时36分
 * @Version 1.0
 *
 * 接口中的静态方法(JDK8.0)
 *      格式:
 *          [public] static 返回类型 方法名 () {}
 *      注意事项:
 *          格式中的[]代表关键字可以省略不写,如果省略不写,由JVM自动填充补全
 *      调用格式:
 *          接口名.静态方法名(实参);
 *      注意事项:
 *          在继承关系中,静态成员可以被子类所继承
 *          在实现关系中,静态方法不可以被实现类所继承
 */
public class InterfaceDemo07 {
	public static void main(String[] args) {
		SuperInterface.method();
		SubClass subClass = new SubClass();

	}
}
