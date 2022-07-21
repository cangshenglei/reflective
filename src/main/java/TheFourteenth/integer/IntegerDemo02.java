package TheFourteenth.integer;

public class IntegerDemo02 {
    public static void main(String[] args) {
        ////装箱1:包装类型的构造器
        Integer integer = new Integer(123);
        ////装箱2:包装类型的静态方法valueOf(基本类型数组)

        Integer integer1 = Integer.valueOf(234);

        System.out.println(integer1);

        ////拆箱1.包装类型的实例方法xxxValue()
        int i = integer1.intValue();

        System.out.println(i);
    }
}
