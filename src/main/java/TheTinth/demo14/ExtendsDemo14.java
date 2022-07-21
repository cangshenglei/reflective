package TheTinth.demo14;

public class ExtendsDemo14 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();

        //判断两个对象的地址值是否相同\
        System.out.println(student == student1);
        System.out.println(student.equals(student1));

        Student student2 = new Student();
        System.out.println(student2.toString());
        System.out.println(student);
        System.out.println(student2);

        int[] ints = {11,22,33};
        System.out.println(ints);
        System.out.println(ints.toString());

        char[] chars = {'a','b','c'};
        System.out.println(chars);
        System.out.println(chars.toString());

        String[] string = {"a","b"};
        System.out.println(string);
        System.out.println(string.toString());

    }
}
