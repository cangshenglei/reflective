package TheTwelve.innerclass.demo5;

public class InnerClassDemo05 {
    public static void main(String[] args) {
//创建实现接口的实现类对象
        SubClass subClass = new SubClass();
        subClass.print("HELLOWORLD");
        System.out.println("===================");

        //使用匿名内部类创建实现对象
        SuperInterface superInterface = new SuperInterface() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };

        System.out.println(superInterface);

        superInterface.print("nihao");


    }
}
