package TheThirteenth.exception.demo2;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        Throwable throwable = new Throwable("自定义Throwable");

        throwable.printStackTrace();

        System.out.println(throwable.getMessage());


    }
}
