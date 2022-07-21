package TheEighteenth.demo3;

public class Ticket implements Runnable {
    //声明票的ID数
    private int ticket = 1;

    @Override
    public void run(){
while (ticket<100){
    method();
}
}

private synchronized void method(){
if (ticket<= 100){
    //模拟实际开发多行代码
    try {
        Thread.sleep(100);
    }catch (InterruptedException e){
        e.printStackTrace();
    }

    //获取当前线程的名字
    String name = Thread.currentThread().getName();

    //开始卖票
    System.out.println(name + "正在售卖编号为" + ticket++ + "的票");
}


}
}

