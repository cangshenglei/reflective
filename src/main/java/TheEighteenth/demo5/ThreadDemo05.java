package TheEighteenth.demo5;

/**
 * @ClassName ThreadDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年03月09日 11时46分
 * @Version 1.0
 */
public class ThreadDemo05 {
	public static void main(String[] args) {
		//创建同一资源对象
		BaoZi bz = new BaoZi();

		//分别创建包子铺和学生的线程对象
		Thread bzp = new Thread(new BaoZiPu(bz),"包子铺");

		Student s = new Student(bz);
		Thread stu1 = new Thread(s,"学生1");
		Thread stu2 = new Thread(s,"学生2");
		Thread stu3 = new Thread(s,"学生3");

		//开启线程
		bzp.start();
		stu1.start();
		stu2.start();
		stu3.start();
	}
}
