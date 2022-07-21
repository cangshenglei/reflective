package TheTwelve.innerclass.demo2;

public class InnerClassDemo02 {
    public static void main(String[] args) {
        Outer outer = new Outer();
      /*  Outer.Inner inner = outer.new Inner();
        inner = new Outer().new Inner();*/
        System.out.println(outer);
        outer.show();
    }

}
