package TheNinth;

import java.util.*;
/**
 * @ClassName CustomerView
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月23日 11时02分
 * @Version 1.0
 */
public class CustomerView {

    //创建最大包含10客户对象的CustomerList 对象，供以下各成员方法使用。
    private CustomerList list = new CustomerList(10);

    public static void main(String[] args) {
        //创建CustomerView实例
        CustomerView cv = new CustomerView();

        //调用 enterMainMenu()方法以执行程序。
        cv.enterMainMenu();
    }

    public void enterMainMenu() {
        //声明并初始化循环变量
        boolean flag = true;

        while (flag) {
            System.out.println("---------------客户信息管理软件-----------------");
            System.out.println("\t\t\t\t1 添 加 客 户");
            System.out.println("\t\t\t\t2 修 改 客 户");
            System.out.println("\t\t\t\t3 删 除 客 户");
            System.out.println("\t\t\t\t4 客 户 列 表");
            System.out.println("\t\t\t\t5 退 出 系 统");
            System.out.print("\t\t\t\t请选择(1-5):");
            char key = CMUtility.readMenuSelection();

            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    flag = false;
                    break;
            }
        }
    }

    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.println("姓名:");
        String name = CMUtility.readString(4);
        System.out.println("性别:");
        char gender = CMUtility.readChar();
        System.out.println("年龄:");
        int age = CMUtility.readInt();
        System.out.println("电话:");
        String phone = CMUtility.readString(11);
        System.out.println("邮箱:");
        String email = CMUtility.readString(25);

        //根据键盘录入的内容进行对象创建
        Customer customer = new Customer(name, gender, age, phone, email);

        boolean result = list.addCustomer(customer);

        if (result) {
            System.out.println("---------------------添加完成---------------------");
        }
    }

    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        System.out.println("请选择待修改客户编号:");
        int cid = CMUtility.readInt();

        //根据客户的编号获取索引
        int index = getIndex(cid);//index存在-1的风险

        //针对客户的索引进行判断
        if (index == -1) {
            System.out.println("替换失败:没有找到指定编号的客户对象");
            return;
        }

        //根据客户的index获取待替换客户对象
        Customer customer = list.getCustomer(index);

        //获取原客户对象的ID
        int id = customer.getId();

        //获取新客户对象的姓名
        String name = customer.getName();
        System.out.println("姓名(" + name + "):");
        name = CMUtility.readString(4,name);

        //获取新客户对象的姓名
        char gender = customer.getGender();
        System.out.println("性别(" + gender + "):");
        gender = CMUtility.readChar(gender);

        //获取新客户对象的年龄
        int age = customer.getAge();
        System.out.println("年龄(" + age + "):");
        age = CMUtility.readInt(age);

        //获取新客户对象的电话
        String phone = customer.getPhone();
        System.out.println("电话(" + phone + "):");
        phone = CMUtility.readString(11,phone);

        //获取新客户对象的邮箱
        String email = customer.getEmail();
        System.out.println("邮箱(" + email + "):");
        email = CMUtility.readString(25,email);

        //根据新的客户属性创建客户对象
        Customer cust = new Customer(name,gender,age,phone,email);
        //修改新客户对象的ID
        cust.setId(id);

        //回收浪费的自增编号
        Customer.setNum(Customer.getNum() - 1);

        //使用新客户对象替换指定索引位置上的对象
        boolean result = list.replaceCustomer(index, cust);

        if (result) {
            System.out.println("---------------------修改完成---------------------");
        }
    }

    private int getIndex(int cid) {
        //声明并初始化客户对象的索引变量
        int index = -1;

        //获取所有客户的数组
        Customer[] cs = list.getAllCustomers();

        //遍历数组
        for (int i = 0; i < cs.length; i++) {
            //使用参数id和当前编号的对象id进行一一判断
            if (cid == cs[i].getId()) {
                index = i;
                break;
            }
        }

        return index;
    }

    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        System.out.println("请选择待删除客户编号:");
        int cid = CMUtility.readInt();
        System.out.println("确认是否删除(Y/N)：");
        char key = CMUtility.readConfirmSelection();

        if (key != 'Y') {
            System.out.println("删除失败:删除客户过程中取消操作");
            return;
        }

        //根据客户的ID获取索引编号
        int index = getIndex(cid);//index存在-1的风险

        //根据索引进行删除
        boolean result = list.deleteCustomer(index);

        if (result) {
            System.out.println("---------------------删除完成---------------------");
        }
    }

    private void listAllCustomers() {
        //获取所有客户对象的存储数组
        Customer[] cs = list.getAllCustomers();

        if (cs.length == 0) {
            System.out.println("查询失败:系统中还没有客户,请添加后进行查询");
            return;
        }

        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱");

        //遍历数组
        for (int i = 0; i < cs.length; i++) {
            //获取当前客户对象
            Customer c = cs[i];

            System.out.println(c.getId() + "\t\t" + c.getName() + "\t\t" + c.getGender() + "\t\t" + c.getAge()
                    + "\t\t" + c.getPhone() + "\t\t" + c.getEmail());
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }
}