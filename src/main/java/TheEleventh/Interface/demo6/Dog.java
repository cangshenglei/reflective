package TheEleventh.Interface.demo6;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时15分
 * @Version 1.0
 */
public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println(getAge() + "岁的" + getName() + "正在吃骨头");
	}

	//狗的特有方法
	public void lookHome() {
		System.out.println(getAge() + "岁的" + getName() + "正在看家");
	}

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}
}
