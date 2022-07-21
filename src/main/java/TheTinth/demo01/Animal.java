package TheTinth.demo01;
/**
 * @ClassName Animal
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月25日 09时02分
 * @Version 1.0
 */
public class Animal {
    public String name;
    public int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("觅食");
    }
    public void sleep(){
        System.out.println("安寝");
    }
}
