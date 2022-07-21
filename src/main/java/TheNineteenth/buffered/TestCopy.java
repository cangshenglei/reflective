package TheNineteenth.buffered;

import java.io.*;
import org.junit.Test;


public class TestCopy {
    @Test
    public void test01() throws IOException {
        //1.创建输入流和输出流
        InputStream fis = new FileInputStream("e:/JAVA_API_1.8_CHS.CHM");
        OutputStream fos = new FileOutputStream(new File("e:/JAVA_API_1.8_CHS2.CHM"));
        BufferedInputStream bis = new BufferedInputStream(fis); //8192
        BufferedOutputStream bos = new BufferedOutputStream(fos); //8192

        //2.使用输入流和输出流完成复制(每次读写一个字节)
        //2.1先读一个字节
        int n ;
        while((n = bis.read())!=-1){
            //2.2写一个字节
            bos.write(n);
            //2.3再读一个字节
            //n = fis.read();
        }
        //3.关闭输入流和输出流
        bis.close();
        bos.close();
        fis.close();
        fos.close();

    }

    @Test
    public void test02() throws IOException {
        //创建输入流和输出流
        InputStream fis = new FileInputStream("e:/VMware-workstation-full-16.1.0-17198959.exe");
        OutputStream fos = new FileOutputStream(new File("e:/VMware-workstation-full-16.1.0-17198959b.exe"));
        BufferedInputStream bis = new BufferedInputStream(fis); //8192
        BufferedOutputStream bos = new BufferedOutputStream(fos); //8192

        //使用输入流和输出流完成复制(字节数组)
        byte [] bytes = new byte[1024];

        int len;
        while((len = bis.read(bytes))!=-1){
            //写
            bos.write(bytes,0,len);
        }
        //关闭输入流和输出流
        bis.close();
        bos.close();
        fis.close();
        fos.close();

    }

    @Test
    public void test03() throws IOException {
        //创建输入流和输出流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:/VMware-workstation-full-16.1.0-17198959.exe")); //8192
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("e:/VMware-workstation-full-16.1.0-17198959b.exe"))); //8192
        //使用输入流和输出流完成复制(字节数组)
        byte [] bytes = new byte[1024];

        int len;
        while((len = bis.read(bytes))!=-1){
            //写
            bos.write(bytes,0,len);
        }
        //关闭输入流和输出流
        bis.close();
        bos.close();
//        fis.close();
//        fos.close();

    }
}
