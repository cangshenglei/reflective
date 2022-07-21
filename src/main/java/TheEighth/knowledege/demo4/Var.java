package TheEighth.knowledege.demo4;

/**
 * @ClassName Var
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 09时55分
 * @Version 1.0
 */
public class Var {
    int num = method();
    static int value = show();

    private static int show() {
        System.out.println("静态变量初始化");
        return 0;
    }

    private int method() {
        System.out.println("实例变量初始化");
        return 0;
    }
}

