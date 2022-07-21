package TheSeventeenth.thread;

public class ThreadDemo03 {
    public static void main(String[] args) {
        SubThread subThread = new SubThread("1");
        SubThread subThread1 = new SubThread("2");

        subThread.start();
        subThread1.start();
    }
}
