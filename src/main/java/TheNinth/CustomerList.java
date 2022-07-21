package TheNinth;

import java.util.Arrays;

public class CustomerList {
    //用来保存客户对象的数组
    private Customer[] cs;
    //记录已保存客户对象的数量
    private int total = 0;


    /*用途：构造器，用来初始化cs数组
    参数：totalCustomer：指定cs数组的最大空间*/
    public CustomerList(int totalCustomer) {
        //针对参数进行非负校验
        if (totalCustomer < 0) {
            System.out.println("初始化失败:数组长度不能为负");
            return;
        }

        cs = new Customer[totalCustomer];
    }


    /*用途：将参数customer添加组中最后一个客户对象记录之后
    参数：customer指定要添加的客户对象
    返回：添加成功返回true；false表示数组已满，无法添加*/
    public boolean addCustomer(Customer customer) {
        //针对对象进行非空校验
        if (customer == null) {
            System.out.println("添加失败:待添加客户不能为空");
            return false;
        }

        //针对数组进行已满校验
        if (total >= cs.length) {
            System.out.println("添加失败:数组已经存满,请联系沙老师进行扩容......");
            return false;
        }

		/*
			假设数组长度为5
				当total=0时,添加前[null,null,null,null,null],将待添加客户对象存储至索引0处
				当total=1时,添加前[客户,null,null,null,null],将待添加客户对象存储至索引1处
				当total=2时,添加前[客户,客户,null,null,null],将待添加客户对象存储至索引2处
				当total=3时,添加前[客户,客户,客户,null,null],将待添加客户对象存储至索引3处
				当total=4时,添加前[客户,客户,客户,客户,null],将待添加客户对象存储至索引4处
		*/
        //将待添加客户对象存储至最后一个客户对象记录之后
        cs[total] = customer;

        //考虑到客户对象已经增加一个,修改total值
        total++;

        //返回添加成功
        return true;
    }


    /*用途：用参数cust替换数组中由index指定的对象
    参数：cust指定替换的新客户对象
            index指定所替换对象在数组中的位置
    返回：替换成功返回true；false表示索引无效，无法替换*/
    public boolean replaceCustomer(int index, Customer cust) {
        //针对索引进行非法校验
        if (index < 0 || index >= total) {
            System.out.println("替换失败:指定索引非法");
            return false;
        }

        //针对对象进行非空校验
        if (cust == null) {
            System.out.println("替换失败:待替换客户不能为空");
            return false;
        }

        //将指定客户替换指定索引位置上的客户
        cs[index] = cust;

        //返回替换成功
        return true;
    }


    /*用途：从数组中删除参数index指定索引位置的客户对象记录
    参数： index指定所删除对象在数组中的索引位置
    返回：删除成功返回true；false表示索引无效，无法删除*/
    public boolean deleteCustomer(int index) {
        //针对索引进行非法校验
        if (index < 0 || index >= total) {
            System.out.println("删除失败:指定索引非法");
            return false;
        }

		/*
			 假设数组长度为5,total=5,待删除索引为1
			 第一次删除:
			    删除前:[客户1,客户2,客户3,客户4,客户5]
			    操作:
			        cs[1] = cs[1+1]
			    删除后:[客户1,客户3,客户3,客户4,客户5]
			 第二次删除:
			    删除前:[客户1,客户3,客户3,客户4,客户5]
			    操作:
			        cs[2] = cs[2+1]
			    删除后:[客户1,客户3,客户4,客户4,客户5]
			 第三次删除:
			    删除前:[客户1,客户3,客户4,客户4,客户5]
			    操作:
			        cs[3] = cs[3+1]
			    删除后:[客户1,客户3,客户4,客户5,客户5]
			 第四次删除:
			    删除前:[客户1,客户3,客户4,客户5,客户5]
			    操作:
			        cs[4] = null
			    删除后:[客户1,客户3,客户4,客户5,null]
		*/

        for (int i = index; i < total - 1; i++) {
            cs[i] = cs[i+1];
        }

        //将真实客户范围最后一个位置赋值为null
        cs[total - 1] = null;

        //考虑到数组中已经删除一个对象,修改total值
        total--;

        //返回删除成功
        return true;
    }


    /*用途：返回数组中记录的所有客户对象
    返回： Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。*/
    public Customer[] getAllCustomers() {
        return Arrays.copyOf(cs,total);
    }


    /*用途：返回参数index指定索引位置的客户对象记录
    参数： index指定所要获取的客户对象在数组中的索引位置
    返回：封装了客户信息的Customer对象*/
    public Customer getCustomer(int index) {
        //针对索引进行非法校验
        if (index < 0 || index >= total) {
            System.out.println("查询失败:指定索引非法");
            return null;
        }

        return cs[index];
    }
}