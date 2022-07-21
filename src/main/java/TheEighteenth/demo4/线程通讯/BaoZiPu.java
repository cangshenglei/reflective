package TheEighteenth.demo4.线程通讯;

public class BaoZiPu implements Runnable{
    private BaoZi bz;
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //判断包子的状态
                if (bz.getFlag()) {
                    //说明有包子,包子铺不需要做包子
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //说明没有包子,包子铺需要做包子
                    String name = Thread.currentThread().getName();

                    System.out.println(name + ":开始做包子啦,包子出锅啦,开始售卖包子啦");

                    //通过sleep()模拟做包子所花费的时间
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //修改包子的状态
                    bz.setFlag(true);

                    //售卖包子,其实就是唤醒消费者线程
                    bz.notify();
                }
            }
        }
    }
}
