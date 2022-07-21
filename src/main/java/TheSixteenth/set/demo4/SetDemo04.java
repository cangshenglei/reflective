package TheSixteenth.set.demo4;


import java.util.HashSet;

//使用HashSet集合存储自定义对象
public class SetDemo04 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();

        //创建学生对象
        Student s1 = new Student(220305001, "张小芳", 18);
        Student s2 = new Student(220305002, "安小妮", 18);
        Student s3 = new Student(220305003, "张小弛", 18);
        Student s4 = new Student(220305001, "张小芳", 19);
//添加对象
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("============================");

        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());

    }

}
