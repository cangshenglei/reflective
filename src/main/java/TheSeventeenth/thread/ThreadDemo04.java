package TheSeventeenth.thread;

public class ThreadDemo04 {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        Runnable run = new SubRunnable();

        //创建2条线程
        Thread t1 = new Thread(run, "自定义线程1");
        Thread t2 = new Thread(run, "自定义线程2");

        //开启线程
        t1.start();
        t2.start();
    }
}
