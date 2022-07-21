package TheTwelve.innerclass.demo3;

public class Outer {
    private static class Inner{
        private static int num =10;
    }

    public void method(){
        System.out.println(Inner.num);
    }
}
