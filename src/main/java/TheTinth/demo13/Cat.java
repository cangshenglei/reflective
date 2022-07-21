package TheTinth.demo13;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    //猫重写eat()

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }
//猫含有特有的方法
    public void catchMouse(){
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }

    //
}
