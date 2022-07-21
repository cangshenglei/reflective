package TheEighth.knowledege.demo1;

public class StaticDemo01 {

    /**
     * @ClassName StaticDemo01
     * @Description 此类用于演示功能
     * @Author Shark
     * @DateTime 2022年02月22日 08时34分
     * @Version 1.0
     *
     * static关键字:
     *      含义:静态的,共享的;
     *      修饰:成员常量,成员变量,成员方法,成员内部类,代码块
     *      作用:被static修饰的内容,不再属于对象自身,而是归属于类,会被通过这个类创建的所有对象所共享
     */
    public static void main(String[] args) {
        //创建3个学生对象
        Student s1 = new Student("郭靖", 18, "射雕");
        Student s2 = new Student("黄蓉", 16, "射雕");
        Student s3 = new Student("洪七公", 50, "射雕");

        System.out.println(s1.print());
        System.out.println(s2.print());
        System.out.println(s3.print());
        System.out.println("==============================");

        //进行教室的更换
        s1.setClassroom("dadiao");
        s2.setClassroom("神雕");
        s3.setClassroom("神雕");

        System.out.println(s1.print());
        System.out.println(s2.print());
        System.out.println(s3.print());



    }


}
