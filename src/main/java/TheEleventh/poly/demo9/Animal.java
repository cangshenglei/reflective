package TheEleventh.poly.demo9;

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

    //抽取多个子类且需要子类们重写的方法
    public abstract void eat ();

    //抽取多个子类且不需要子类们重写的方法
    public void sleep () {
        System.out.println("睡觉觉");
    }
}
