package TheEleventh.Interface.demo8;

/**
 * @ClassName SuperInterface
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时44分
 * @Version 1.0
 */
public interface SuperInterface {
	public default void method01 () {
		//method();
		System.out.println(5);
	}
	public default void method02 () {
		//method();
		System.out.println(8);
	}
        static void method() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}
	public static void show01 () {
		//show();
		System.out.println(5);
	}
	public static void show02 () {
		//show();
		System.out.println(8);
	}
	/*private void method () {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}*/

}
