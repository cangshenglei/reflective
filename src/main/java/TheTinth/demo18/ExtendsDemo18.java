package TheTinth.demo18;

public  class ExtendsDemo18 {
    public static void main(String[] args) {
        Cat cat = new Cat("tom",1);

//创建猫对象

        cat.catchMouse();
        cat.eat();
        cat.sleep();
        System.out.println("=====================");

        //创建狗对象
        Dog dog = new Dog("TwoHa", 3);
        dog.lookHome();
        dog.eat();
        dog.sleep();
    }

}
