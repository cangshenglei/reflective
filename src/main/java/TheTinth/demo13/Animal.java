package TheTinth.demo13;

public class Animal {
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
    public void eat(){
        System.out.println("觅食");
    }
    //多个子类中共同的方法sleep(),不需要子类们进行重写
    public void sleep () {
        System.out.println("睡觉觉");
    }
}
