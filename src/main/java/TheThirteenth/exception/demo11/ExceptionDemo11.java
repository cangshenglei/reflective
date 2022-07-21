package TheThirteenth.exception.demo11;

public class ExceptionDemo11 {

    public static void main(String[] args) {
        int result = method05();
        System.out.println(result);
    }

    private static int method05() {
        int a = 42;
        int b = 10;

        try {
            System.out.println("try");
            return a;//准备将10返回给调用者方法,并结束方法,正当结束的同时发现finally,先执行finally,再将10进行返回
        } catch (Exception e) {
            System.out.println("catch");
            return b;//准备将20返回给调用者方法,并结束方法,正当结束的同时发现finally,先执行finally,再将20进行返回
        } finally {
            System.out.println("finally");
            a += b;
        }
    }

    private static int method04() {
        int a = 10;
        int b = 20;

        try {
            System.out.println("try");
            return a;//准备将10返回给调用者方法,并结束方法,正当结束的同时发现finally,先执行finally,再将10进行返回
        } catch (Exception e) {
            System.out.println("catch");
            return b;//准备将20返回给调用者方法,并结束方法,正当结束的同时发现finally,先执行finally,再将20进行返回
        } finally {
            System.out.println("finally");
            return a += b;
        }
    }

    private static int method03() {
        try {
            System.out.println("try");
            return 10;//准备将10返回给调用者方法,并结束方法,正当结束的同时发现finally,先执行finally,再将10进行返回
        } catch (Exception e) {
            System.out.println("catch");
            return 20;//准备将20返回给调用者方法,并结束方法,正当结束的同时发现finally,先执行finally,再将20进行返回
        } finally {
            System.out.println("finally");
            return 30;
        }
    }

    private static int method02() {
        try {
            System.out.println("try");
            System.out.println(1/0);
            return 10;
        } catch (Exception e) {
            System.out.println("catch");
            return 20;
        }
    }

    private static void method01() {
        try {
            System.out.println("try");
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println("catch");
        }
    }
}
