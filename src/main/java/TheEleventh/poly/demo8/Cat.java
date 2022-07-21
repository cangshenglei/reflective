package TheEleventh.poly.demo8;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }

    public void catchMouse () {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }

}
