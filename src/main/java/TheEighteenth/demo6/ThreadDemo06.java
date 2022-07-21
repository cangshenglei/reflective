package TheEighteenth.demo6;


import TheEighteenth.demo1.Ticket;

//单例设计模式的线程安全问题
public class ThreadDemo06 {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println(CEO.getCEO());
            }
        };

        //创建线程对象
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
//开启线程
        t1.start();
        t2.start();
        t3.start();

    }
}
