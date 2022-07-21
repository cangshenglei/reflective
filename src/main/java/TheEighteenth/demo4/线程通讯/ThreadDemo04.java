package TheEighteenth.demo4.线程通讯;

public class ThreadDemo04 {
    public static void main(String[] args) {
        //创建同一资源对象
        BaoZi bz = new BaoZi();

        //分别创建包子铺和学生的线程对象
        Thread bzp = new Thread(new BaoZiPu(bz),"包子铺");
        Thread stu = new Thread(new Student(bz),"学生");

        //开启线程
        bzp.start();
        stu.start();


    }
}
