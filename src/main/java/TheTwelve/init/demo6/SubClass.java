package TheTwelve.init.demo6;

public class SubClass extends SuperClass{
    int var = this.getVar();
    static int num = getNum();

    private static int getNum() {
        System.out.println("子类的静态变量显式初始化");
        return 10;
    }

    private int getVar() {
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
