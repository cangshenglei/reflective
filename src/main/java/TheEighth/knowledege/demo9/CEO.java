package TheEighth.knowledege.demo9;


/**
 * @ClassName CEO
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 11时29分
 * @Version 1.0
 */
public class CEO {
    private static CEO ceo;

    private CEO() {}

    public static CEO getCEO() {
        if (ceo == null) {
            ceo = new CEO();
        }

        return ceo;
    }
}
