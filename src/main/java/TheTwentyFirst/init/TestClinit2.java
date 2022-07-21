package TheTwentyFirst.init;



/*
（1）使用某个类的静态的常量（static  final）
（2）通过子类调用父类的静态变量，静态方法，只会导致父类初始化，不会导致子类初始化，即只有声明静态成员的类才会初始化
（3）用某个类型声明数组并创建数组对象时，不会导致这个类初始化
 */
public class TestClinit2 {
	public static void main(String[] args) {
		//System.out.println(D.NUM);//D类不会初始化，因为NUM是final的
		
		System.out.println(F.num);
//		F.test();//F类不会初始化，E类会初始化，因为num和test()是在E类中声明的
//
//		//G类不会初始化，此时还没有正式用的G类
		//G g = new G();
		G[] arr = new G[5];//没有创建G的对象，创建的是准备用来装G对象的数组对象
		arr[0] = new G();
        //G[]是一种新的类型，是数组类想，动态编译生成的一种新的类型
        //G[].class

	//	AtGuiguClass at;
	//	AtGuiguDemo atGuiguDemo;

	}
}
class D{
	public static final int NUM = 10;
	static{
		System.out.println("D类的初始化");
	}
}
class E{
	static int num = 10;
	static{
		System.out.println("E父类的初始化");
	}
	public static void test(){
		System.out.println("父类的静态方法");
	}
}
class F extends E{
	static{
		System.out.println("F子类的初始化");
	}
}

class G{
	static{
		System.out.println("G类的初始化");
	}
}