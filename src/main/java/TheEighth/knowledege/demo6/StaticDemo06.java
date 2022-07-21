package TheEighth.knowledege.demo6;
/**
        * @ClassName StaticDemo06
        * @Description 此类用于演示功能
        * @Author Shark
        * @DateTime 2022年02月22日 10时16分
        * @Version 1.0
        *
        * 静态方法的注意事项:
        *      1.静态方法随着类的加载而加载,而且只加载唯一的一次
        *      2.在静态方法中不可以使用实例成员
        *      3.在静态方法中不可以使用this关键字
        */
public class StaticDemo06 {
    public static void main(String[] args) {

    }

    public void method1(){
        method03();
    }
    public void method02(){
        method1();
    }
    public static void  method03(){
        method04();
    }
    public  static void  method04(){

    }







}
