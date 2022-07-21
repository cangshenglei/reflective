package TheSixteenth.set.demo9;

import java.util.Comparator;
import java.util.TreeSet;

public class SetDemo09 {
    public static void main(String[] args) {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        };

        //创建TreeSet集合
        TreeSet<Student> set = new TreeSet<>(comparator);

        Student s1 = new Student(220305001, "张小芳", 18);
        Student s2 = new Student(220305002, "张小弛", 18);
        Student s3 = new Student(220305003, "安小妮", 18);
        Student s4 = new Student(220305004, "李小朦", 18);
        Student s5 = new Student(220305005, "钟小霞", 18);
        Student s6 = new Student(220305006, "崔小荣", 18);
        Student s7 = new Student(220305007, "叶小玲", 18);

        set.add(s4);
        set.add(s7);
        set.add(s1);
        set.add(s6);
        set.add(s2);
        set.add(s5);
        set.add(s3);

        for (Student s : set) {
            System.out.println(s);
        }

    }
}
