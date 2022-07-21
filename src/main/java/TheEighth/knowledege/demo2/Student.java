package TheEighth.knowledege.demo2;


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
public class Student {

    String name;
    int age;
    static String classroom;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age,String classroom) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String print () {
        return name + "=" + age + "=" + classroom;
    }
}
