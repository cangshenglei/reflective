package TheEighteenth.demo4.线程通讯;

public class Student implements Runnable {
    private BaoZi bz;

    public Student(BaoZi bz) {
        this.bz = bz;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //判断包子的状态
                if (bz.getFlag()) {
                    //说明有包子,学生对象开始吃包子
                    String name = Thread.currentThread().getName();

                    System.out.println(name + ":开始吃包子啦,包子真好吃,再来一个");

                    //通过sleep()模拟学生吃包子的消耗的时间
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //修改包子的状态
                    bz.setFlag(false);

                    //再来一个,唤醒包子铺开始做包子
                    bz.notify();
                } else {
                    //说明没有包子,学生对象开始等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
