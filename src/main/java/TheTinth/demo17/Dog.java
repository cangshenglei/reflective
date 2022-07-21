package TheTinth.demo17;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月25日 11时55分
 * @Version 1.0
 */
public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println(getAge() + "岁的" + getName() + "正在吃骨头");
	}
	//狗含有特有方法
	public void lookHome () {
		System.out.println(getAge() + "岁的" + getName() + "正在看家");
	}
}
