package TheNineteenth.file1;

import org.junit.Test;

import java.io.*;

/**
 * FileOutputStream
 * 字节流   输出流（写） 节点流
 * 目的地是File
 * public abstract void write(int b) throws IOException;  写一个字节  根据编号值写入对应的字符
 *  public void write(byte b[]) throws IOException  写多个字节（字节数组的全部）
 *   public void write(byte b[], int off, int len) throws IOException  字节数组的一部分
 */
public class TestFileOutputStream {
    @Test
    public void test01() throws IOException {
        //创建一个输出流
        //File file = new File("e:/java0212/readme.txt"); //写操作，文件不要存在
        //OutputStream fos = new FileOutputStream(file);
        //OutputStream fos = new FileOutputStream(new File("e:/java0212/readme.txt"));
        //OutputStream fos = new FileOutputStream("e:/java0212/readme.txt"); //构造方法的重载，操作更简单 默认覆盖
        OutputStream fos = new FileOutputStream("e:/java0212/readme.txt",true); //追加而不是覆盖
        //使用输出流
        fos.write(97);//"a"
        fos.write(65);//"A"
        fos.write(54); //"6"
        fos.write(53); //"5"



        //关闭输出流
        fos.close();
    }
    @Test
    public void test02() throws IOException {
        //创建一个输出流
        OutputStream fos = new FileOutputStream("e:/java0212/readme.txt"); //构造方法的重载，操作更简单
        //使用输出流
        fos.write("atguigu".getBytes());
        fos.write("尚硅谷".getBytes());
        //fos.write("尚硅谷".getBytes("GBK"));
        //fos.write("尚硅谷".getBytes("UTF-8"));
        fos.write("atguigu".getBytes(),5,2); //gu

        //关闭输出流
        fos.close();
    }
    @Test
    public void test03() throws  Exception{
//创建一个输出流
        OutputStream fos = new FileOutputStream("e:/java0212/readme.txt"); //构造方法的重载，操作更简单
        //使用输出流
        fos.write("atguigu".getBytes());
        fos.write('\r');
        fos.write('\n');
        fos.write("尚硅谷".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("atguigu".getBytes(),5,2); //gu


        //关闭输出流
        fos.close();
    }
}
