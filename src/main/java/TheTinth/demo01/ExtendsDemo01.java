package TheTinth.demo01;

public class ExtendsDemo01 {
    public static void main(String[] args) {
        //创建对象-mao
        Cat cat = new Cat();
        cat.name="tom";
        cat.age=23;
        cat.catchMouse();
        cat.sleep();
        cat.eat();
        //创建狗对象

        Dog dog = new Dog();
        dog.lookHome();
    }
}
