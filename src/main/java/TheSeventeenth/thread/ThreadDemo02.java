package TheSeventeenth.thread;

public class ThreadDemo02 {
    public static void main(String[] args) throws InterruptedException {

        //获取当前正在执行的线程对象
        Thread thread = Thread.currentThread();
        //获取当前正在执行线程的名字
        System.out.println(thread.getName());

        //10秒倒计时
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

    }

}
