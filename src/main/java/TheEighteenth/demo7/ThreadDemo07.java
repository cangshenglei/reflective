package TheEighteenth.demo7;

/**
 * @ClassName ThreadDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年03月09日 14时10分
 * @Version 1.0
 *
 * 使用同步代码块解决单例的线程安全问题
 */
public class ThreadDemo07 {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println(CEO.getCEO());
			}
		};

		//创建线程对象
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);


		//开启线程
		t1.start();
		t2.start();
		t3.start();
	}
}
