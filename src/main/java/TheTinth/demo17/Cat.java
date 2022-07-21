package TheTinth.demo17;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月25日 11时55分
 * @Version 1.0
 */
public class Cat extends Animal {
	//猫重写eat()

	public Cat() {
		System.out.println("mao");
	}

	@Override
	public void eat() {

	}
	//猫含有特有方法
	public void catchMouse () {
		System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
	}



}
