package TheTinth.demo17;

/**
 * @ClassName Animal
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月25日 11时53分
 * @Version 1.0
 */
public abstract class Animal {
	private String name;
	private int age;

	public Animal() {
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//多个子类中共同的方法eat(),考虑所有动物吃的东西不同,需要子类们进行重写
	/*public void eat () {
		System.out.println("吃东东");
	}*/

	public  abstract void eat();

	//多个子类中共同的方法sleep(),不需要子类们进行重写
	public void sleep () {
		System.out.println("睡觉觉");
	}
}
