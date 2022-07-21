package TheNineteenth.file1;

import org.junit.Test;

import java.io.*;

public class TestCopy {
    @Test
    public void test01() throws IOException {
        //1.创建输入流和输出流
        InputStream fis = new FileInputStream("e:/JAVA_API_1.8_CHS.CHM");
        OutputStream fos = new FileOutputStream(new File("e:/JAVA_API_1.8_CHS2.CHM"));

        //2.使用输入流和输出流完成复制(每次读写一个字节)
        //2.1先读一个字节
        /*
        int n = fis.read();
        while(n!=-1){
            //2.2写一个字节
            fos.write(n);
            //2.3再读一个字节
            n = fis.read();
        } */
        int n ;
        while((n = fis.read())!=-1){
            //2.2写一个字节
            fos.write(n);
            //2.3再读一个字节
            //n = fis.read();
        }
        //3.关闭输入流和输出流
        fis.close();
        fos.close();

    }

    @Test
    public void test02() throws IOException {
        //创建输入流和输出流
        InputStream fis = new FileInputStream("e:/JAVA_API_1.8_CHS.CHM");
        OutputStream fos = new FileOutputStream(new File("e:/JAVA_API_1.8_CHS3.CHM"));

        //使用输入流和输出流完成复制(字节数组)
        byte [] bytes = new byte[1024];
        /*
        int len = fis.read(bytes);
        while(len!=-1){
            //写
            //fos.write(bytes);
            fos.write(bytes,0,len);
            //读
            len = fis.read(bytes);
        }
        */
        int len;
        while((len = fis.read(bytes))!=-1){
            //写
            fos.write(bytes,0,len);
        }
        //关闭输入流和输出流
        fis.close();
        fos.close();

    }

    @Test
    public void test03() throws IOException {
        //1.创建输入流和输出流
        InputStream fis = new FileInputStream("e:/java0212/readme.txt");
        OutputStream fos = new FileOutputStream(new File("e:/java0212/readme2.txt"));

        //2.使用输入流和输出流完成复制(每次读写一个字节)
        //2.1先读一个字节
        int n ;
        while((n = fis.read())!=-1){
            //2.2写一个字节
            fos.write(n);
            //输出一个字节
            System.out.println((char)n);
            //2.3再读一个字节
            //n = fis.read();
        }
        //3.关闭输入流和输出流
        fis.close();
        fos.close();

    }
}
