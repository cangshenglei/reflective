package TheTinth.demo13;

public class ExtendsDemo13 {
    public static void main(String[] args) {
        Cat cat = new Cat("tom",1);
        cat.catchMouse();
        cat.eat();
        cat.getAge();
        System.out.println("__________");

        Dog dog = new Dog();
        dog.lookHome();


    }
}
