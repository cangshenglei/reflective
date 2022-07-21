package TheTwelve.init.demo7;

public class SubClass extends SuperClass {
    int var = getVar();
    static int num = getNum();

    public static int getNum() {
        System.out.println("子类的静态变量显式初始化");
        return 10;
    }

    public int getVar() {
        System.out.println("子类的实例变量显式初始化");
        return 10;
    }

    public SubClass() {
        super();
        System.out.println("子类的构造器中显式代码");
    }

    {
        System.out.println("子类的构造器代码块");
    }

    static {
        System.out.println("子类的静态代码块");
    }
}
