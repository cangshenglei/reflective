package TheSeventh;

public class Var {
    //声明实例变量
    int num = 10;

    //声明局部变量
    public void method () {
        int num = 20;
        System.out.println(num);//20    就近原则
        System.out.println(this.num);
    }

    public void show () {
        System.out.println("this = " + this);
    }
}
