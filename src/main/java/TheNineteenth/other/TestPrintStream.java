package TheNineteenth.other;

import com.atguigu.object.Employee;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * PrintStream
 * 字节流 输出流（打印只有输出没有输入）处理流
 *
 * System.out只是PrintStream类的一个实例
 out.println(500);
 out.println(3.14);
 out.println(true);
 out.println('a');
 out.println("atguigu");
 out.println(new Employee("华为","张三","上海",24));、

 println():可以直接接收基本数据类型、String、对象数据，写入到目的地。但是写入文件后都编程了字符串String
 500#3.14#true


 */
public class TestPrintStream {
    @Test
    public void test01(){
        InputStream is = System.in; //键盘是一个文件，readme.txt  System.in是一个流，读键盘这个文件
        PrintStream out = System.out;//显示器是一个文件，readme.txt,System.out是一个流，向显示器写数据
        PrintStream err = System.err;
        System.out.println(500);
        System.out.println(3.14);
        System.out.println(true);
        System.out.println('a');
        System.out.println("atguigu");
        System.out.println(new Employee("华为","张三","上海",24));
    }

    @Test
    public void test02(){
        //InputStream is = System.in; //键盘是一个文件，readme.txt  System.in是一个流，读键盘这个文件
        PrintStream out = System.out;//显示器是一个文件，readme.txt,System.out是一个流，向显示器写数据
        //PrintStream err = System.err;

        out.println(500);
        out.println(3.14);
        out.println(true);
        out.println('a');
        out.println("atguigu");
        System.out.println(new Employee("华为","张三","上海",24));
    }

    @Test
    public void test03() throws FileNotFoundException {

        //PrintStream out = System.out;//显示器是一个文件，readme.txt,System.out是一个流，向显示器写数据
        //PrintStream out = new PrintStream(new FileOutputStream("e:/readme.txt"));
        PrintStream out = new PrintStream("e:/readme.txt");
        out.println(500);
        out.println(3.14);
        out.println(true);
        out.println('a');
        out.println("atguigu");
        out.println(new Employee("华为","张三","上海",24));
    }


}
