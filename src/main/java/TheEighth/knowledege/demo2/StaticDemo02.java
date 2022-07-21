package TheEighth.knowledege.demo2;

public class StaticDemo02 {
/**
 * @ClassName OOPDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 08时46分
 * @Version 1.0
 *
 * 静态变量:
 *      含义:在类中方法外,且含有static关键字修饰的变量
 *      格式:
 *          修饰符 static 数据类型 变量名;
 *      作用:
 *          被static修饰的变量不再属于对象,而是归属于类,会被通过这个类创建的所有对象所共享
 *      调用:
 *          类名.静态变量名;
 */
public static void main(String[] args) {


        //创建3个学生对象
        Student s1 = new Student("郭靖", 18,"牛逼");
        Student s2 = new Student("黄蓉",16);
        Student s3 = new Student("洪七公", 50);

    Student.classroom = "射雕";

    System.out.println(s1.print());
    System.out.println(s2.print());
    System.out.println(s3.print());
    System.out.println("==============================");




}
}
