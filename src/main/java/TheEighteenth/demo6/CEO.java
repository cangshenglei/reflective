package TheEighteenth.demo6;

public class CEO {
    private static CEO ceo;

    private CEO() {
    }

    //线程1 线程2 线程3
    public static CEO getCEO() {
        if (ceo == null) {
            ceo = new CEO();
        }
        return ceo;
    }
}
