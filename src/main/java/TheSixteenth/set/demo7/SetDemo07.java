package TheSixteenth.set.demo7;

import java.util.TreeSet;

public class SetDemo07 {
    public static void main(String[] args) {
        method03();
    }

/*    Exception in thread "main" java.lang.ClassCastException: TheSixteenth.set.demo7.Student cannot be cast to java.lang.Comparable
    at java.util.TreeMap.compare(TreeMap.java:1294)
    at java.util.TreeMap.put(TreeMap.java:538)
    at java.util.TreeSet.add(TreeSet.java:255)
    at TheSixteenth.set.demo7.SetDemo07.method03(SetDemo07.java:22)
    at TheSixteenth.set.demo7.SetDemo07.main(SetDemo07.java:7)*/


    private static void method03() {
        //创建TreeSet集合
        TreeSet<Student> set = new TreeSet<>();

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

        System.out.println(set);
    }

    private static void method02() {
        //创建TreeSet集合
        TreeSet<String> set = new TreeSet<>();

        set.add("b");
        set.add("尚硅谷");
        set.add("A");
        set.add("0");
        set.add("c");
        set.add("a");
        set.add("acb");
        set.add("abc");

        System.out.println(set);
    }

    private static void method01() {
        //创建TreeSet集合
        TreeSet<Integer> set = new TreeSet<>();

        set.add(44);
        set.add(22);
        set.add(55);
        set.add(11);
        set.add(33);

        System.out.println(set);
    }
}
