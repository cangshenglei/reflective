package TheEleventh.Interface.demo5;

/**
 * @ClassName InterfaceDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时03分
 * @Version 1.0
 *
 * 默认方法的注意事项:
 *      1.当子类继承父类并实现父接口,父类中的实现方法和父接口中的默认方法发生同名的情况,
 *      通过子类对象调用了该同名方法,执行的是父类的实例方法
 *      2.当子类不继承父类,实现多个父接口,多个父接口中出现了同名的默认方法,子类必须以实例
 *          方法的形式重写多个父接口中的默认方法
 */
public class InterfaceDemo05 {
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		subClass.method();
	}

}
