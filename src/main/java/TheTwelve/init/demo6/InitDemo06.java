package TheTwelve.init.demo6;

public class InitDemo06 {
    public static void main(String[] args) {
        new SubClass();
    }
}


  /*  父类的静态变量显式初始化
            父类的静态代码块
    子类的静态变量显式初始化
            子类的静态代码块
    父类的实例变量显式初始化
            父类的构造器代码块
    父类的构造器中显式代码
            子类的实例变量显式初始化
    子类的构造器代码块
            子类的构造器中显式代码*/