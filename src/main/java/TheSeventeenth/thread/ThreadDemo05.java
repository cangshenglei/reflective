package TheSeventeenth.thread;

public class ThreadDemo05 {
    public static void main(String[] args) {
        //使用匿名内部类创建Runnable实现类对象
        Runnable runnable = new Runnable(){


            @Override
            public void run() {
//获取当前线程的名字
                String name = Thread.currentThread().getName();

                for (int i = 1; i <= 30; i++) {
                    System.out.println(name + ":" + i);
                }
            }
        };

//需要多少个线程,就以Runnable实现类对象创建多少个Thread对象
        Thread t1 = new Thread(runnable,"自定义线程1");
        Thread t2 = new Thread(runnable,"自定义线程2");

        //开启线程
        t1.start();
        t2.start();
    }
}
