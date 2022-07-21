package TheNinth;

/**
 * @ClassName Customer
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月23日 09时34分
 * @Version 1.0
 */
public class Customer {
    //客户编号
    private int id;
    //客户姓名
    private String name;
    //客户性别
    private char gender;
    //客户年龄
    private int age;
    //客户电话
    private String phone;
    //客户邮箱
    private String email;
    //客户编号自增变量
    private static int num = 1;

    public Customer(int id, String name, char gender, int age, String phone, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Customer(String name, char gender, int age, String phone, String email) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Customer.num = num;
    }
}
