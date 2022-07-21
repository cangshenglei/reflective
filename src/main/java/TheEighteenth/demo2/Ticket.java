package TheEighteenth.demo2;

public class Ticket implements Runnable{
    //声明票的ID数
    private int ticket = 1;

    @Override
    public void run() {

        while (ticket <= 100) {
            //线程1 线程2 线程3
            synchronized (this) {
                if (ticket <= 100) {
                    //模拟实际开发多行代码
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //获取当前线程的名字
                    String name = Thread.currentThread().getName();

                    //开始卖票
                    System.out.println(name + "正在售卖编号为" + ticket++ + "的票");
                }
            }
        }
    }
}
