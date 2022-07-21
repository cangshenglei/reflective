package TheSeventh;
/**
 * @ClassName OOPDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 08时39分
 * @Version 1.0
 *
 * 面向对象(OOP,Object Oriented Programming)
 *      Java是"面向对象程序设计语言"
 *
 * 面向过程:强调的是"过程",往往关注事情"怎么做",比喻成"执行者",基本单位:函数(类似于Java中的方法)
 * 面向对象:强调的是"对象",往往关注事情"找谁做",比喻成"指挥者",基本单位:类
 *
 * 面向过程和面向对象没有好坏之分,都是人们在生活中解决问题的手段之一:
 *      在解决一些较小的问题时,往往选择"面向过程思想"
 *      在解决一些较大的问题是,往往选择"面向对象思想"
 *
 * 面向对象思想三大阶段:
 *      面向对象基本思想(JavaSE)
 *      面向接口思想
 *      面向切面思想(真正的面向对象思想,手撕Spring框架源码)
 *
 * 面向对象学习小技巧:
 *      1.看有没有合适做事情的对象所对应的类
 *          如果有,进行下一步
 *          如果没有,自定义类
 *      2.根据类创建或获取对象
 *      3.根据对象调用方法
 *
 * 面向对象三大特征:
 *      封装,继承,多态
 *
 *
 */

/**
 * @ClassName OOPDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 09时03分
 * @Version 1.0
 *
 * 类与对象的关系:
 *      类:是生活中一类事物属性信息和行为动作的统称
 *          猫类:
 *              属性信息:姓名,年龄,品种,颜色......
 *              行为动作:吃饭,睡觉,抓老鼠......
 *      对象:是这一类事物的具体体现
 *          猫对象:
 *              属性信息:Tom,2,英短,白......
 *              行为动作:怎么吃,怎么睡,怎么抓老鼠
 *
 *      关系:
 *          类是对象的模版,抽象
 *          对象是类的实体,实例
 *      类与对象的先后关系:
 *          先类后对象
 */


/**
 * @ClassName OOPDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 09时11分
 * @Version 1.0
 *
 * 类的设计:
 *      设计过程:
 *          1.根据类的属性信息和行为动作设计出基础的类
 *          2.在类中加入"封装"思想
 *          3.在类中加入"构造器"概念
 *          4.在类中加入特殊(静态)的属性信息和行为动作
 *          5.将类一拆为多,加入"继承"思想
 *          6.解决继承思想的安全解决,加入"抽象"概念
 *          7.将多个类继续一拆为多,加入"接口"概念
 *          8.在类或接口中加入"常量"概念
 *          9.在类或接口中加入"嵌套"概念
 *          10.在类中加入构造器代码块的概念
 *          11.在类中加入静态代码块的概念
 *          12.熟悉Java中特殊的类"枚举类"
 *      分类:
 *          测试类:基于测试效果演示的类(含有main()或者@Test)
 *          标准类:
 *              将类完整的设计出来
 *
 *      解释:
 *          属性信息 ==> 代码中的"成员量"
 *          行为动作 ==> 代码中的"成员方法"
 *
 *          成员量:
 *              成员变量:在类中方法外的变量
 *                  实例变量:在类中方法外,且没有static关键字修饰的变量,实例变量归属于"对象"
 *                  静态变量:在类中方法外,且含有static关键字修饰的变量,静态变量归属于"类"(暂不涉及)
 *              成员常量:(暂不涉及)
 *
 *          成员方法:
 *              实例方法:在类中没有static关键字修饰的方法,实例方法归属于"对象"
 *              静态方法:在类中含有static关键字修饰的方法,静态方法归属于"类"(暂不涉及)
 *      格式:
 *          public class 类名 {
 *              实例变量
 *              实例方法
 *          }
 *
 * 对象的创建:
 *      格式:
 *          类名 对象名 = new 类名();
 *
 * 对象的使用:
 *      对象名.实例变量名;
 *      对象名.实例方法名(实参);
 */


/**
 * @ClassName OOPDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 10时04分
 * @Version 1.0
 *
 * 局部变量和实例变量的区别:
 *      局部变量:声明在代码块中或者代码块声明上的变量
 *      实例变量:声明在类中方法外,且没有static关键字修饰的变量
 *
 * 区别:
 *      代码中声明的位置不同:
 *          局部变量:代码块中或者代码块声明上
 *          实例变量:类中方法外
 *      内存中存储的位置不同:
 *          局部变量:栈内存
 *          实例变量:堆内存
 *      是否含有默认值不同:
 *          局部变量:没有
 *          实例变量:含有
 *      代码中变量的作用域不同:
 *          局部变量:所属方法中
 *          实例变量:所属类中(静态方法,静态常量,静态代码块,静态成员内部类中无效)
 *      内存中变量的生命周期不同:
 *          局部变量:随着方法的调用而加载,随着方法的出栈而消失
 *          实例变量:随着对象的创建而加载,随着对象的回收而消失
 *      加载方式和次数不同:
 *          局部变量:每调用一次方法,局部变量就会加载一次,最多可以加载无数次
 *          实例变量:每创建一次对象,实例变量就会加载一次,最多可以加载无数次
 *
 */
/**
 * @ClassName OOPDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 10时15分
 * @Version 1.0
 *
 * 回顾day01变量的注意事项:
 *      在同一作用域内不可以声明同名的变量
 *
 * 由此推论:
 *      局部变量和实例变量在代码中的作用域不同,所以可以在同一个类中声明同名的实例变量和局部变量
 *
 * this关键字的第一种用法:
 *      位置:
 *          实例方法中或构造器中
 *      格式:
 *          this.实例变量名;
 *          this.实例方法名(实参);
 *      作用:
 *          用来区别同一个类中同名的实例变量和局部变量
 *      含义:
 *          哪个对象调用了this所在的实例方法或构造器,this关键字就代表哪个对象
 *
 */


/**
 * @ClassName OOPDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 11时00分
 * @Version 1.0
 *
 * 封装思想
 *      含义:
 *          给程序中不同的内容添加不同的访问权限级别,从而达到保护的效果
 *      作用:
 *          提供程序中内容的安全性
 *      核心:
 *          封装思想的核心中是四种权限访问级别
 *
 * 四种权限访问级别:
 *      权限访问级别从大到小的关系如下:
 *          public > protected > 缺省(sheng三声) > private
 *
 *      解释:
 *          public:公共的
 *          protected:受保护的
 *          缺省:什么都不写
 *          private:私有的
 *
 * private关键字:
 *      含义:
 *          private关键字是封装思想的体现形式之一
 *      修饰:
 *          用来修饰成员变量,成员常量,构造器,成员方法,成员内部类
 *
 * 私有实例变量:
 *      含义:
 *          被private修饰的实例变量
 *      格式:
 *          private 数据类型 变量名;
 *      作用:
 *          被private修饰的内容只能在本类中访问,从外界无法进行访问
 *      应用:
 *          1.将类中所有的实例变量的进行私有化
 *          2.针对每个被私有化的实例变量都提供一对的公共访问方式:set()和get()
 *              举例:去银行存钱和取钱
 *                  存钱的过程:需要带着钱(有参数),不用带着钱回来(无返回值)
 *                  取钱的过程:不需要带着钱(没有参数),带着钱回来(有返回值)
 *
 *
 *
 *
 */

/**
 * @ClassName OOPDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 14时08分
 * @Version 1.0
 *
 * 构造器(构造方法)
 *      作用:
 *          1.构造器中隐式的内容给对象进行成员初始化(day12讲解,实例初始化过程)
 *          2.构造器中显式的内容给对象进行变量的赋值
 *      格式:
 *          修饰符 类名 () {
 *              //隐式内容
 *              //显式内容
 *          }
 *
 */

/**
 * @ClassName OOPDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 14时23分
 * @Version 1.0
 *
 * 构造器的注意事项:
 *      1.构造器的名字必须和所在类名相同
 *      2.构造器没有返回类型,而且连void都不能有
 *      3.当一个类没有任何的构造器时,JVM自动给其分配一个public无参构造器,用来给对象的成员进行初始化,
 *      一旦这个类有任何构造器时,JVM不再给其提供
 *      4.构造器支持重载
 *      5.构造器中包含两个部分,显式部分和隐式部分,隐式部分代码优先于显式部分的代码
 */

/**
 * @ClassName OOPDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 14时36分
 * @Version 1.0
 *
 * JavaBean标准类
 *      当程序员设计类的时候,没有明确需求,程序员间一种关于类设计约定俗成的规范
 *
 * 必须做的:
 *      1.一个.java文件中只能有且仅有一个类文件
 *      2.类中所有的成员变量和成员常量必须进行私有化
 *      3.针对类中每个被私有化的成员变量和成员常量提供一对的公共访问方式(get()和set())
 *      4.无参构造器
 *
 * 可以有的:
 *      1.有参构造器
 *      2.成员内部类(暂不涉及)
 *      3.构造器代码块
 *      4.静态代码块(暂不涉及)
 *      5.三个实例方法toString(),equals(),hashCode()(暂不涉及)
 *
 * 快捷键
 *      Alt + Ins(ert)
 */


/**
        * @ClassName OOPDemo11
        * @Description 此类用于演示功能
        * @Author Shark
        * @DateTime 2022年02月21日 15时11分
        * @Version 1.0
        *
        * 匿名对象:
        *      含义:
        *          没有名字的对象
        *      好处:
        *          更好的节约内存使用率
        *      弊端:
        *          匿名对象只能使用一次
        *      场景:
        *          当对象只使用一次的时候,更推荐使用匿名对象,更好的节约内存使用率
        */

/**
 * @ClassName OOPDemo12
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 15时21分
 * @Version 1.0
 *
 * 对象数组:
 *      存储对象元素的数组
 */

/**
 * @ClassName OOPDemo13
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 15时41分
 * @Version 1.0
 *
 * 类中的私有方法
 *      格式:
 *          private 返回类型 方法名 () {}
 *      特点:
 *          被private修饰的方法只能在本类中进行调用,在本类之外不可以被调用
 */


/**
 * @ClassName OOPDemo13
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 15时41分
 * @Version 1.0
 *
 * 类中的私有方法
 *      格式:
 *          private 返回类型 方法名 () {}
 *      特点:
 *          被private修饰的方法只能在本类中进行调用,在本类之外不可以被调用
 */


/**
 * @ClassName OOPDemo14
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 16时07分
 * @Version 1.0
 *
 * 构造器代码块
 *      格式:
 *          {
 *              所有构造器中相同的代码
 *          }
 *      注意事项:
 *          构造器代码块优先于构造器中的显式代码,构造器代码块由构造器中隐式部分代码进行调用
 *      作用:
 *          当多个构造器中存在相同的代码时,可以将这些相同的代码抽取到构造器代码块中
 *
 *
 */

/**
 * @ClassName OOPDemo15
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月21日 16时18分
 * @Version 1.0
 *
 * this关键字的第二种格式:
 *      位置:
 *          构造器中
 *      格式:
 *          this(实参);
 *      作用:
 *          调用本类中其它的构造器
 *      含义:
 *          当构造器无法进行对象成员的初始化时(隐式部分),通过this(实参)调用其它构造器完成
 *      注意事项:
 *          如果含有this(实参),必须将其写在构造器中的第一行
 */



public class TheFirst {
    public static void main(String[] args) {
        /*Student s1 = new Student();
        System.out.println(s1.age);

        System.out.println("================");

        //获取学生对象的行为动作(实例方法)
        s1.study();

        System.out.println("================");

        //创建学生对象s2
        Student s2 = new Student();

        System.out.println(s2.name);
        System.out.println(s2.age);*/


       /* Var var = new Var();

        var.method();

        Var var1 = new Var();
        Var var2 = new Var();

        System.out.println("var1 = " + var1);
        var1.show();

        System.out.println("============");

        System.out.println("var2 = " + var2);
        var2.show();


        Student s = new Student();
        s.getAge();
        s.setAge(4);

//创建学生对象
        Student s1 = new Student("张小芳",18);
        Student s2 = new Student("张小弛",18);
        Student s3 = new Student("崔小荣",18);
        Student s4 = new Student("叶小玲",18);
        Student s5 = new Student("李小朦",18);
        Student s6 = new Student("安下妮",18);
        Student s7 = new Student("钟小霞",18);

        //创建Student[]类型数组
        Student[] stu ={s1,s2,s3,s4,s5,s6,s7};

        for (Student student : stu) {
            Student sd= student;
            System.out.println(sd.getAge() + "="+ sd.getName());
        }

        PrivateMethod privateMethod = new PrivateMethod();

        privateMethod.method01();*/

        /*Teacher teacher = new Teacher();
        teacher.toString();*/


        new worker().toString();
    }
}
