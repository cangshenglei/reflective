package TheEleventh.Interface.demo5;

/**
 * @ClassName A
 * @Description 此接口用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时09分
 * @Version 1.0
 */
public interface B {
	public default void method() {
		System.out.println("接口B中的默认方法");
	}
}
