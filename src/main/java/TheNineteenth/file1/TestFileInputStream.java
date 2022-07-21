package TheNineteenth.file1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * FileInputStream
 * 字节流  输入流（读） 节点流
 * 数据源是文件
 *
 * int n = fis.read(); 对一个字节 赋值给n  如果文件读完毕继续读，返回-1
 * len = fis.read(bytes); //将文件中的数据放入字节数组，字节数组length=3，真正读取的字节数可能不同，作为返回值返回
 *
 * String---byte[]
 * "尚硅谷".getBytes()
 * byte[] ---->String
 * new String(bytes)
 * new String(bytes,0,len)
 *
 *
 */
public class TestFileInputStream {
    @Test
    public void test01() throws Exception{
        //创建输入流
        InputStream fis = new FileInputStream("e:/java0212/readme.txt");
        //使用输入流
        int n = fis.read();
        while(n!=-1){
            System.out.println((char)n);
            n = fis.read();
        }

//        int n = fis.read();
//        System.out.println((char)n);
//        n = fis.read();
//        System.out.println((char)n);
//        n = fis.read();
//        System.out.println((char)n);
//        n = fis.read();
//        System.out.println((char)n);
//        n = fis.read();
//        System.out.println((char)n);
//        n = fis.read();
//        System.out.println((char)n);
//        n = fis.read();
//        System.out.println((char)n);
//        n = fis.read();
//        System.out.println(n);
        //关闭输入流
        fis.close();
    }

    @Test
    public void test02() throws Exception{
        //创建输入流
        InputStream fis = new FileInputStream("e:/java0212/readme.txt");
        //使用输入流
//        byte [] bytes = new byte[3];
//        int len = fis.read(bytes); //将文件中的数据放入字节数组，字节数组length=3，真正读取的字节数可能不同，作为返回值返回
//        System.out.println(new String(bytes,0,len));
//        len = fis.read(bytes); //将文件中的数据放入字节数组，字节数组length=3，真正读取的字节数可能不同，作为返回值返回
//        System.out.println(new String(bytes,0,len));
//        len = fis.read(bytes); //将文件中的数据放入字节数组，字节数组length=3，真正读取的字节数可能不同，作为返回值返回
//        System.out.println(new String(bytes,0,len));
//        len = fis.read(bytes);
//        System.out.println(len);

        byte [] bytes = new byte[3];
        int len = fis.read(bytes);
        while(len!=-1){
            //输出
            System.out.println(new String(bytes,0,len));
            //读
            len = fis.read(bytes);
        }
        // 关闭输入流
        fis.close();
    }

    @Test
    public void test03() throws Exception{
        //创建输入流
        InputStream fis = new FileInputStream("e:/java0212/readme.txt");
        //使用输入流
        byte [] bytes = new byte[3];
        int len = fis.read(bytes,1,2);
        System.out.println(len);
        System.out.println((char)bytes[0]);
        System.out.println((char)bytes[1]);
        System.out.println((char)bytes[2]);

        // 关闭输入流
        fis.close();
    }
}
