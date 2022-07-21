package TheSeventh;

public class PrivateMethod {
    public void method01 () {
        method();
        System.out.println(5);
    }

    public void method02 () {
        method();
        System.out.println(8);
    }

    private void method () {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}

