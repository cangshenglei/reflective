package TheTinth.demo18;

public class Cat  extends  Animal{
    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }

   //猫类的特有方法
    public void catchMouse () {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
