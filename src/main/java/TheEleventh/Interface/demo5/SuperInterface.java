package TheEleventh.Interface.demo5;

/**
 * @ClassName SuperInterface
 * @Description 此接口用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时04分
 * @Version 1.0
 */
public interface SuperInterface {
	public default void method(){
		System.out.println("父接口中的默认方法");
	}
}
