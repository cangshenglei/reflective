package TheTinth.demo18;

public class Dog extends  Animal{
    @Override
    public void eat() {}
        {
            System.out.println(getAge() + "岁的" + getName() + "正在吃shit");
    }
    //狗类的特有方法
    public void lookHome () {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
