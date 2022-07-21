package TheEleventh.poly.demo8;

public class PolyDemo08 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(3);
        Animal cat1 = new Cat();
        ((Cat) cat1).catchMouse();

        //向下转型
        Cat c =(Cat)cat;

        c.catchMouse();
        //狗拿耗子
        //使用多态的形式创建Dog对象
        Animal a = new Dog();

        //将父类类型对象a向下转型为Cat类型
        Cat dog = (Cat)a;

        dog.catchMouse();

    }
}
