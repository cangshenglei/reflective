package TheTwelve.init.demo2;

public class SubClass extends SuperClass {
    int subClass = getSubVar();
    SubClass sc = new SubClass();
    private int getSubVar() {

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



}
