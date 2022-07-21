package TheEleventh.Interface.demo6;

/**
 * @ClassName Animal
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月26日 11时14分
 * @Version 1.0
 */
public abstract class Animal implements AnimalInterface{
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
}
