package TheSeventeenth.thread;

public class SubThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            //获取线程的名字
            String name = getName();
            System.out.println(name + ":" + i);
        }
    }
    public SubThread() {
    }

    public SubThread(String name) {
        super(name);
    }
}
