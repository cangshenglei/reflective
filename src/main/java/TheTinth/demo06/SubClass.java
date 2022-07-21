package TheTinth.demo06;

public class SubClass extends SuperClass{
    int num=20;

    public void method(){
        int num =30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
