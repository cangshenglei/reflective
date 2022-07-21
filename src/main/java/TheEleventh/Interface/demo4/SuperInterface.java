package TheEleventh.Interface.demo4;

public interface SuperInterface {
    public default void method () {
        System.out.println("默认方法");
    }
}
