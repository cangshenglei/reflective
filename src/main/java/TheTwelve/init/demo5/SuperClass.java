package TheTwelve.init.demo5;

public class SuperClass {
    int superVar = getSuperVar();
    static int superNum = getSuperNum();

    private static int getSuperNum() {
        System.out.println("父类的静态变量显式初始化");
        return 10;
    }

    private int getSuperVar() {
        System.out.println("父类的实例变量显式初始化");
        return 10;
    }

    public SuperClass() {
        super();
        System.out.println("父类的构造器中显式代码");
    }

    {
        System.out.println("父类的构造器代码块");
    }

    static {
        System.out.println("父类的静态代码块");
    }



}
