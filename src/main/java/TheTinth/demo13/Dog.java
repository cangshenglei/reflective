package TheTinth.demo13;

public class Dog  extends Animal{
    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃骨头");
    }
    //狗含有特有方法
    public void lookHome () {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }}
