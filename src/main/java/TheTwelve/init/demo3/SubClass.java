package TheTwelve.init.demo3;

public class SubClass extends SuperClass{
 static    int num =20;

    public SubClass() {
        super();
    }



    public void method () {
        System.out.println("num = " + this.num);//this:SubClass
    }
}
