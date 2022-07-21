package TheSeventeenth.thread;

public class SubRunnable implements Runnable {
    public static void main(String[] args) {



    }
    private void method(){

    }
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            //获取线程的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + ":" + i);
        }
    }
}