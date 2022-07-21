package TheTwelve.init.demo4;

public class SubClass {
    int subVar = getSubVar();
    static int subNum = getSubNum();



    private int getSubVar() {
        System.out.println("子类的实例变量显式初始化");
        return 10;
    }



    private static int getSubNum() {
        System.out.println("子类的静态变量显式初始化");
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
