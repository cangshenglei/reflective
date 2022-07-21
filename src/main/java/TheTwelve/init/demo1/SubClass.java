package TheTwelve.init.demo1;

public class SubClass{
    int num = method();

    {
        System.out.println("构造器代码块");
    }

    private int method() {
        System.out.println("实例变量的显式初始化");
        return 0;
    }

    public SubClass(int num) {
        this.num = num;
    }

    public SubClass() {
        System.out.println("构造器中的显式代码");
    }


}

