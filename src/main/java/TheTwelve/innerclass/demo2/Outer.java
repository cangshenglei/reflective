package TheTwelve.innerclass.demo2;

public class Outer {
    private int a;
    static int b;
    int c;
    int num = 10;

    private class Inner {
        int num = 20;
        private int a;
        //static int b;
        int b;

        public void show() {
            int num = 30;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            System.out.println("num = " + num);//30
            System.out.println("num = " + this.num);//20
            System.out.println("num = " + Outer.this.num);//10

        }
public void method(){
    Inner inner = new Inner();
    System.out.println(inner.a);
}


    }

    public String show(){
        Inner inner = new Inner();
        System.out.println("1");
       return "1";

    }

}