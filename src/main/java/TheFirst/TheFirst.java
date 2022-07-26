package TheFirst;

public class TheFirst {

    /*
	public class BasicDemo02{}在程序中声明一个类,类的名字为BasicDemo02
	类是Java程序中最基础的单位
	在一个.java文件中,只允许声明一个public class,如果需要声明多个class,需要新建.java文件进行保存
	类中可以没有任何内容,只不过这样的类没有实际意义
*/

    /*
		public static void main (String[] args) {} 这一行代表叫做"主方法"
		主方法是程序的执行入口,当运行字节码文件的时候,JVM会自动执行主方法中的语句
		主方法只能声明在类中,声明在其它的位置"编译报错"
		主方法中可以没有任何内容,只不过这样的主方法没有实际意义
	*/

    /*
	关键字:在程序中被赋予特殊含义英文单词

	特点:
		1.在Java中关键字一共53个,其中常用关键字51个,保留关键字2个
		2.关键字单词全部小写
		3.在部分高级开发工具中,颜色高亮显示
		4.main和args不是关键字,它们是后面讲解的"标识符"
*/
    /*
	变量:在程序中其值可以改变的量

	变量的三要素:
		数据类型
		变量名
		初始化值

	变量声明的初始化格式:
		直接声明初始化:
			数据类型 变量名 = 初始化值;

		先声明后初始化
			数据类型 变量名;
			变量名 = 初始化值;
*/

        /*
	数据类型:在程序中数据的类型

	分类:
		基本类型(4类8种)
			整数型
				byte
				short
				int(默认)
				long
			浮点型
				float
				double(默认)
			字符型
				char
			布尔型
				boolean
		引用类型(暂不涉及,后面讲解)
			数组
			类
			接口


	整数型:
		存储整数数据的类型,里面一共包含4个
		每创建一个byte类型的变量,在内存中占用1个字节
		每创建一个short类型的变量,在内存中占用2个字节
		每创建一个int类型的变量,在内存中占用4个字节
		每创建一个long类型的变量,在内存中占用8个字节
	浮点型:
		浮点类型的数据类似于小数,并不是真正意义上的小数,浮点类型的变量无法保证小数点后所有数据在运行的过程中是精确的
		每创建一个float类型的变量,在内存中占用4个字节
		每创建一个double类型的变量,在内存中占用8个字节
	字符型:
		字符类型的变量存储的是单个字符,单个字符可以是字母,数字,中文,标点符号等
		每创建一个char类型变量,占用内存有2套规则:内码和外码规则
			如果char类型变量是底层源码中创建的,遵循"内码"规则,每个字符在内存中占用2个字节
			如果char类型变量是由程序员进行创建的,遵循"外码"规则,所谓外码规则就是当前变量所在的.java文件中的编码规则
				如果文本编码规则是"GBK",每个字符在内存中占用2个字节
				如果文本编码规则是"UTF8",每个字符在内存中存在对应的规则:
					如果是英文,数字,英文标点符号字符,每个字符在内存中占用1个字节
					如果是中文字符,每个字符在内存中占用3个字节
	布尔型:
		布尔类型的变量在程序中表示真与假,分别使用true和false进行表示
		每创建一个boolean类型的普通变量,在内存中占用4个字节
		创建一个boolean类型的数组,数组中的每个boolean元素在内存中占用1个字节
*/

/*
	标识符:在程序中给包,类,接口,方法,变量等起的名字

	命名规则:
		硬性:必须遵守,否则编译报错
		软性:程序员约定俗成,原则上需要遵守

	硬性规则:
		1.必须由26个英文大小写字母,0-9数字,美元符$,下划线_,中文字符(不推荐)中的内容组成
		2.0-9数字不能开头
		3.不能是Java中的53个关键字

	软性规则:
		1.定义标识符的时候,需要做到"见名知意"
		2.不推荐标识符中含有中文
		3.定义标识符的时候不推荐使用美元符$,在程序中$有特殊表示
		4.给不同的内容进行命名的时候,需要遵循命名规范
			类的命名规范
				一个单词:单词首字母大写
				多个单词:每个单词首字母大写
			方法的命名规范
				一个单词:单词全部小写
				多个单词:第一个单词全部小写,第二个单词开始每个单词首字母大写
			变量的命名规范
				一个单词:单词全部小写
				多个单词:第一个单词全部小写,第二个单词开始每个单词首字母大写

*/
/*
	变量的初始化值:
		在程序中声明变量时给变量进行的初始化赋值操作

	初始化值的注意事项:
		1.初始化值必须在变量数据类型对应的取值范围中获取,如果超过取值范围,编译报错
		2.在给long类型变量进行初始化赋值的时候,需要在初始化值的后面添加字母L或者l,推荐字母L
			long num = 123L;
		3.浮点类型的初始化值有三个部分,分别为负数,正数,整数
		4.在给float类型变量进行初始化赋值的时候,需要在初始化值的后面添加字母F或者f
		5.char类型的变量的初始化值,使用''进行表示,''中有且仅有一个字符
		6.boolean类型变量的初始化只有true和false
*/
        //声明并初始化8种基本类型的变量和字符串变量
public static void main(String[] args) {
    byte var01 = 123;
    System.out.println(var01);
    var01 = 124;
    System.out.println(var01);
    short var02 = 12345;
    int var03 = 1234567890;
    long var04 = 9876543210L;

    System.out.println(var02);
    System.out.println(var03);
    System.out.println(var04);
    float var05 = 12.34F;
    double var06 = 67.34D;
    System.out.println(var05);
    System.out.println(var06);

    //声明并初始化字符类型变量
    char var07 = 'a';
    System.out.println(var07);

    //声明并初始化布尔类型变量
    boolean var08 = true;
    System.out.println(var08);

    //声明并初始化字符串类型变量
    String var09 = "HelloWorld";//使用""表示的就是字符串
    System.out.println(var09);
/*
	初始化值注意事项的补充:
		1.整数类型变量的初始化值有4种表示方式,无论哪种进行赋值表示,最终的输出结果都是十进制数字
			(1)十进制表示法
			(2)二进制表示法
				初始化值以0b或者0B作为开头,数字只有0和1
			(3)八进制表示法
				初始化值以0作为开头,数字只有0到7
			(4)十六进制表示法
				初始化值以0x或者0X作为开头,使用字母a~f分别表示10~15
		2.字符类型变量的初始化值有4种表示方式,无论哪种进行赋值表示,最终的输出结果都是''字符表示法进行输出
			(1)''字符表示法
			(2)数字表示法(0~65535)
				十进制数字和Unicode码表中的字符进行了一一对应
			(3)十六进制表示法
				'\ uXXXX',XXXX表示十六进制数字,如果该数字不足4位,前面需要进行补0占位
			(4)转义
		3.浮点类型可以理解为小数，但并不是真正意义上的小数，底层数据结构不是以十进制为标准，而是一套IEEE二进制浮点数算术标准（IEEE 754）,在进行数据运行的时候浮点类型可能会损失精度


	字符集:
		十进制数字和各个字符的一套对应规则

	常见的字符集:
		ASCII字符集:是世界上第一张字符集(码表),由美国人创建,将26个英文大小写字母,数字,标点和0~127之间的数字进行一一对应
			字符0==>十进制数字48
			字符A==>十进制数字65
			字符a==>十进制数字97
		Unicode字符集:世界上各个国家通用的字符集(码表)(0~65535)

*/
//以十进制表示法初始化int变量
    int num01 = 10;
    System.out.println(num01);
    //以二进制表示法初始化int变量
    int num02 = 0b10;
    System.out.println(num02);
    //以十进制表示法初始化int变量
    int num03 = 010;
    System.out.println(num03);
    //以十六进制表示法初始化int变量
    int num04 = 0x10;
    System.out.println(num04);

    System.out.println("==================================");

    //以''字符表示法初始化char变量
    char c1 = 'a';
    System.out.println(c1);

    //以数字表示法初始化char变量(0~65535)
    char c2 = 97;
    System.out.println(c2);

    //以十六进制数表示法初始化char变量
    char c3 = '\u0061';
    System.out.println(c3);
    double d1 = 2.0;
    double d2 = 1.1;
    System.out.println(d1 - d2);

    /*
	声明初始化变量的注意事项
		1.在方法中声明的变量,称之为"局部变量"
		2.局部变量在使用前必须给其进行初始化,否则编译报错
		3.在同一个作用域内声明的变量不可以发生同名的情况
			作用域:变量所属的那对大括号
		4.变量的使用不能超出作用域范围,否则编译报错
		5.在定义初始化同一种数据类型多个变量时，可以通过一个数据类型在一行上直接定义多个变量，中间用`逗号“,”`间隔
		6.如果变量是同一数据类型,可以将初始化后的变量的名字赋值给另外一个变量
*/

}


}
