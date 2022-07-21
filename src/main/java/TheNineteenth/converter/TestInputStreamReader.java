package TheNineteenth.converter;

/**
 * InputStreamReader  转换流
 * 处理流  输入流  字节流还是字符流 ？？ 字符流
 *   Reader fr = new InputStreamReader(System.in);
 *   public class InputStreamReader extends Reader
 */

import org.junit.Test;

import java.io.*;

/**
 * 将从键盘输入的一行行数据写入到一个文本文件中
 * 方法1：不使用BufferedReader的readLine()而是使用Scanner的nextLine()
 * 方法2：使用转换流InputStreamReader
 *
 * 生活中的案例
 * 墙上有一个两相的插座，手中有一个三相的插头，怎么办？
 * 三相的插头 ------>(三相插座)转换头（两相插头）----> 两相的插座
 * Reader fr = new InputStreamReader(System.in); //进去的是字节流，出来的是字符流，实现了转换
 * Reader fr = new FileReader(new File("e:/java0212/readme.txt"));
 *
 *
 * @throws Exception
 */


public class TestInputStreamReader {
    @Test
    public void test01() throws Exception{
        //创建流
        //InputStream is = System.in; //键盘当做一个文件 in指向键盘这个文件
        Reader fr = new InputStreamReader(System.in); //进去的是字节流，出来的是字符流，实现了转换
        //Reader fr = new FileReader(new File("e:/java0212/readme.txt"));
        Writer fw = new FileWriter(new File("e:/java0212/readme3.txt"));
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        //复制
        String str = br.readLine();
        while(!"bye".equals(str)){ //输入bye，结束输入
            //写一行
            bw.write(str);
            //bw.write("\r\n"); //不具有平台移植性 不同平台的换行符不同 \r \n \r\n
            bw.newLine();
            //输出
            System.out.println(str);
            //再读一行
            str = br.readLine();
        }
        //关闭流
        br.close();
        bw.close();
        fr.close();
        fw.close();
    }
    //FileWriter FileReader无法指定编码
    //InputStreamReader和OutputStreamWriter可以指定编码
    //如果使用FileWriter FileReader遇到了乱码问题，使用InputStreamReader和OutputStreamWriter来解决
    //public class FileReader extends InputStreamReader
    @Test
    public void test02() throws Exception{
        Reader fileReader = new FileReader("E:\\File_GBK.txt");
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char)read);//atguigu�й��
        }
        fileReader.close();
    }

    @Test
    public void test03() throws Exception{
        //FileReader fileReader = new FileReader("E:\\File_GBK.txt");
        Reader fileReader = new InputStreamReader(new FileInputStream("E:\\File_GBK.txt"),"GBK");
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char)read);//atguigu尚硅谷
        }
        fileReader.close();
    }
}
