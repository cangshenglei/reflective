package TheTwelve.init.demo3;

public class SuperClass {
    int num =10;
    public SuperClass() {
        this.method();//类型:SuperClass类型的子类对象
    }

    public void method () {
        System.out.println("num = " + this.num);
    }
}
