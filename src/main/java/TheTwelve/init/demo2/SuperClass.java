package TheTwelve.init.demo2;

public class SuperClass {

    int superVar = getSuperVar();

    private int getSuperVar() {
        System.out.println("父类的实例变量显式初始化");
        return 10;
    }

    public SuperClass() {
        System.out.println("父类的构造器中显式代码");
    }

    {
        System.out.println("父类的构造器代码块");
    }

}
