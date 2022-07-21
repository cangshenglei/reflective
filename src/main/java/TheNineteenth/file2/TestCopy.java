package TheNineteenth.file2;

import org.junit.Test;

import java.io.*;

/**
 * 使用字节流可以读写任意类型的文件
 * 使用字符流只可以读写文本文件（.txt  .java  .properties ） 使用记事本可以正确打开的文件
 *
 * 问题：doc docx word文档是文本文件
 * 不是。不可以使用记事本打开，只可以使用专门的软件，比如word、wps来打开，是二进制文件
 *
 * 字符流没有提供指定编码的功能
 * 解决：
 * idea中字符集是utf-8，window平台上是gbk （ansi）
 * 1.使用FileReader的父类InputStreamReader，FileWriter的父类 OutputStreamWriter来指定编码解决
 * 2.修改字符集一致  window平台上改为utf-8
 * 3.使用相对路径，相对于idea的路径，此时创建的文件默认是idea指定的编码
 *
 * 字符的方法：
 *  int n = fr.read();
 *  int len = fr.read(cbuf);
 *
 *   fw.write(n);
 *   fw.write(cbuf,0,len);
 *
 *  相对路径到底是哪里
 *  当前模块 @Test Junit
 * C:\Users\Administrator\IdeaProjects\javase0212\ch14_io
 * 当前项目 main
 * C:\Users\Administrator\IdeaProjects\javase0212
 *
 *
 *
 */
public class TestCopy {
    //一个一个字符的读写
    @Test
    public void test01() throws IOException {
        //创建字符输入流和输出流
        Reader fr = new FileReader(new File("e:/java0212/readme.txt"));
        Writer fw = new FileWriter(new File("e:/java0212/readme2.txt"));
        //使用字符输入流和输出流完成复制（一个个字符读写）
        int n = fr.read();
        while(n!=-1){
            //写
            fw.write(n);
            //输出
            System.out.println((char)n);
            //读
            n= fr.read();
        }
        //关闭字符输入流和输出流
        fr.close();
        fw.close();
    }

    //通过字符数组的读写
    @Test
    public void test02() throws Exception{
        //创建字符输入流和输出流
        Reader fr = new FileReader(new File("e:/java0212/readme.txt"));
        Writer fw = new FileWriter(new File("e:/java0212/readme2.txt"));
        //使用字符输入流和输出流完成复制（字符数组读写）
        char [] cbuf = new char[6];
        int len = fr.read(cbuf);
        while(len!=-1){
            //写
            fw.write(cbuf,0,len);
            //输出
            //System.out.println(cbuf);
            System.out.println(new String(cbuf,0,len));
            //读
            len = fr.read(cbuf);
        }
        //关闭字符输入流和输出流
        fr.close();
        fw.close();
    }

    @Test
    public void test03() throws Exception{
        //创建字符输入流和输出流
        File file = new File("readme.txt");
        System.out.println(file.getAbsolutePath());
        Reader fr = new FileReader(file);
        Writer fw = new FileWriter(new File("readme2.txt"),true);
        //使用字符输入流和输出流完成复制（字符数组读写）
        char [] cbuf = new char[6];
        int len = fr.read(cbuf);
        while(len!=-1){
            //写
            fw.write(cbuf,0,len);
            //输出
            //System.out.println(cbuf);
            System.out.println(new String(cbuf,0,len));
            //读
            len = fr.read(cbuf);
        }
        //关闭字符输入流和输出流
        //fw.flush();//刷新
        fr.close();
        fw.close(); //先刷新，在关闭
    }
}
