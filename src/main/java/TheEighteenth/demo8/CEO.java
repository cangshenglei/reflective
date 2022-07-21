package TheEighteenth.demo8;

/**
 * @ClassName CEO
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年03月09日 14时02分
 * @Version 1.0
 */
public class CEO {
	private static CEO ceo;

	private CEO() {
	}

	//线程1 线程2 线程3
	public static CEO getCEO() {
		if (ceo == null) {
			method();
		}
		return ceo;
	}

	private static synchronized void method () {
		if (ceo == null) {
			ceo = new CEO();
		}
	}
}
