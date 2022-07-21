package TheEleventh.Interface.demo6;

/**
 * @ClassName AnimalInterface
 * @Description 此接口用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时13分
 * @Version 1.0
 */
public interface AnimalInterface {
	//需要实现类们重写的方法
	void eat();

	//不需要实现类们重写的方法
	default void sleep() {
		System.out.println("睡觉觉");
	}
}
