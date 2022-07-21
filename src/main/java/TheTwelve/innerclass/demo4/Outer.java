package TheTwelve.innerclass.demo4;

public class Outer {
    //外部类的实例变量
    int a = 10;
    int num = 10;

    public void method () {
        //外部类的局部变量
        int b = 20;

        int num = 20;

        class Inner {
            //内部类的实例变量
            int c = 30;
            int num = 30;

            public void show () {
                //内部类的局部变量
                int d = 40;
                int num= 40;

                System.out.println(d);
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);

                System.out.println("==============");

                System.out.println(num);
                System.out.println(this.num);
                System.out.println(Outer.this.num);

                System.out.println("==============");

                d = 44;
                c = 33;
                //b = 22;
            }
        }

        //创建内部类对象
        Inner inner = new Inner();
        inner.show();
    }
}
