package TheSeventh;

public class worker {
    public worker() {
        this(1);
        System.out.println("无参");
    }

    public worker(int a) {
        this(1,2);
        System.out.println("单个参");
    }
    public worker(int a,int b) {
        System.out.println("两个参");
    }

    {
        System.out.println("代码块");
    }
}
