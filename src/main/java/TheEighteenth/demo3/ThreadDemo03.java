package TheEighteenth.demo3;

public class ThreadDemo03 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        //创建3条线程
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
