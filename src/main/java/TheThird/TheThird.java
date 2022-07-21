package TheThird;

public class TheThird {
    public static void main(String[] args) {
        /*
	所有编程语言最核心,最基础的结构是"顺序结构",代码从上至下依次执行

	在顺序结构中包含:
		分支结构
		循环结构
		调用结构

	分支结构和循环结构统称为"流程控制语句"

	流程控制语句分类:
		分支结构
			判断语句:if语句
			选择语句:switch语句
		循环结构
			for语句
			while语句
			do...while语句

	学习流程控制语句的小技巧:
		1.记住流程控制语句的基本格式
		2.记住流程控制语句的执行流程
		3.精通流程控制语句的实际应用
*/

        /*
	三种循环的区别:
		从扩展格式角度分析:
			1.循环变量的作用域不同:
				for语句结束,变量在内存中释放
				while和dowhile语句在语句结束后依然可以使用
			2.循环条件语句的判断次数不同:
				同需求下,dowhile语句循环条件语句判断次数比while和for少一次
		从标准格式角度分析:
			1.如果需求有明显的循环次数或者范围,选择for语句
			2.如果需求没有明显的循环次数或者范围,选择while语句
			3.在实际开发中,不会使用dowhile语句
*/

        /*
	控制语句:在程序中控制分支,循环,调用结构的语句

	分类:
		break关键字
		continue关键字
		return关键字(暂不涉及,后面讲解)

	break关键字:
		应用场景:
			(1)switch语句中
			(2)循环语句中
		作用:
			(1)结束switch语句
			(2)结束循环语句

	continue关键字:
		应用场景:
			循环语句中
		作用:
			结束当次循环,继续下一次循环

	控制语句的注意事项:
		在同一个作用域中,控制语句的后面不能编写任何代码,否则编译报错,因为编写的代码永远执行不到
*/
        /*
	流程控制语句的注意事项
		if,for,while这三个流程控制语句{}中的语句体如果有且仅有一行,可以将{}省略不写,推荐写上
*/
/*
	dowhile语句的格式:
		do {
			循环体语句
		} while (循环条件语句);


	执行流程:
		1.先执行循环体语句
		2.再确认循环条件语句的结果是true还是false;
		3.如果是true,跳回第1步继续执行;
		  如果是false,dowhile语句结束

	为了和for循环语句进行相互转换,衍生出dowhile扩展格式
		初始化语句;
		do {
			循环体语句
			迭代语句
		} while (循环条件语句);


*/
/*
	if语句的第一种格式:
		if (条件判断语句) {
			语句体
		}

	执行流程
		1.先确认条件判断语句的结果是true还是false;
		2.如果是true,执行语句体,if语句结束;
		  如果是false,if语句结束;

	需求:判断指定整数是否为偶数
*/
/*
	if语句的第二种格式:
		if (条件判断语句) {
			语句体1;
		} else {
			语句体2;
		}

	执行流程:
		1.先确认条件判断语句的结果是true还是false
		2.如果是true,执行语句体1,if语句结束;
		  如果是false,执行语句体2,if语句结束;

	注意事项:
		三元运算符和if语句的第二种格式比较相像,在实际开发中更推荐使用if语句的第二种格式;原因:三元运算符具有一定的局限性,里面只能存放结果值,无法编写语句,只有在if语句的第二种格式比较简单的时候,才编写三元运算符进行简化

	需求:判断一个整数的奇偶性
*/

/*
	if语句的第三种格式:
		if (条件判断语句1) {
			语句体1
		} else if (条件判断语句2) {
			语句体2
		}
		......
		else if (条件判断语句n) {
			语句体n
		} else {
			语句体n+1
		}

	执行流程:
		1.先确认条件判断语句1的结果是true还是false;
		2.如果是true,执行语句体1,if语句结束;
		  如果是false,确认条件判断语句2的结果是true还是false;
		......
		3.当所有的条件判断语句都为false时,执行else中的语句体n+1

	注意事项:
		if语句的第三种格式可以将else语句省略不写,但推荐写上

	需求:判断两个整数之间的关系(大于,等于,小于)
*/
/*
	for语句的格式:
		for (初始化语句;循环条件语句;迭代语句) {
			循环体语句
		}

		初始化语句:声明并初始化记录循环次数(范围)的"循环变量"
		循环条件语句:判断循环变量是否满足循环条件
		迭代语句:循环变量的后续操作
		循环体语句:重复执行多次的代码

	执行流程:
		1.先执行初始化语句;
		2.确认循环条件语句的结果是true还是false;
		3.如果是true,执行循环体语句,继续执行第4步;
		  如果是false,for语句结束;
		4.执行迭代语句;
		5.跳回第2步,继续执行

	需求:打印10遍HelloWorld
*/

/*
	switch语句的格式:
		switch (数据值) {
			case 数据值1:
				语句体1
				break;
			case 数据值2:
				语句体2
				break;
			......
			case 数据值n:
				语句体n
				break;
			default:
				语句体n+1
				break
		}

	执行流程:
		1.先确认switch()中的数据值是多少;
		2.将数据值1和数据值进行匹配,看是否匹配成功;
		3.如果匹配成功,执行语句体1,执行break关键字,switch语句结束;
		  如果匹配失败,将数据值2和数据值进行匹配,看是否匹配成功;
		......
		4.当所有case后的数据值都和数据值匹配失败,执行default中的语句体n+1,执行break关键字,switch语句结束;
*/
/*
	while语句的格式:
		while (循环条件语句) {
			循环体语句
		}

	执行流程:
		1.先确认循环条件语句的结果是true还是false;
		2.如果是true,执行循环体语句;
		  如果是false,while语句结束;
		3.跳回第1步,继续执行

	为了和for循环语句进行相互转换,衍生出while循环语句的扩展格式
		初始化语句;
		while (循环条件语句) {
			循环体语句
			迭代语句
		}

	需求:打印10遍HelloWorld
*/
/*
	switch语句的注意事项:
		1.switch()中数据值的数据类型:
			基本类型只支持int类型,考虑到有三种类型可以自动提升成int,衍生出四种支持类型,分别是byte,short,char,int
			引用类型:
				在JDK1.4(包含)及其以前,不支持引用类型
				在JDK5.0(包含)及其以后,支持枚举类型Enum
				在JDK7.0(包含)及其以后,支持字符串类型String
		2.swtich语句中的default和if语句第三种格式中的else一样,都可以省略不写,推荐写上
		3.switch语句中的case和default顺序可以颠倒,不影响执行流程,推荐将default写在所有case的下面
		4.switch语句中break关键字可以省略不写,但是会出现case穿透效果
*/
    }
}