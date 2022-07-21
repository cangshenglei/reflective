package TheEighth.knowledege.demo3;

public class StaticDemo03 {

    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("张小芳", 18);
        Student s2 = new Student("崔小荣", 18);
        Student s3 = new Student("安小妮", 18);
        Student s4 = new Student();
        s4.setName("叶小玲");
        s4.setAge(18);

        System.out.println(s1.print());
        System.out.println(s2.print());
        System.out.println(s3.print());
        System.out.println(s4.print());
    }
}
