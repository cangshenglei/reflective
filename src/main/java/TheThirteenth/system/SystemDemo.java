package TheThirteenth.system;

public class SystemDemo {
    public static void main(String[] args) {
        //获取当前的时间
        //long start = System.currentTimeMillis();
        long start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {

        }

        //获取当前的时间
        //long end = System.currentTimeMillis();
        long end = System.nanoTime();

        System.out.println(end - start);
    }
}
