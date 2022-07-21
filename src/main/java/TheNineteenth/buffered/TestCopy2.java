package TheNineteenth.buffered;


import org.junit.Test;

import java.io.*;
/**
 * BufferedInputStream BufferedOutputStream
 * 字节流  处理流
 * 优点：提高了读写的速度
 * 注意
 * 1.如何关闭流：相反顺序关闭   先开后关
 * 2.其实只要关闭高层流即可，高层流会关闭底层流
 */
public class TestCopy2 {

    @Test
    public void test01() throws Exception{
        //创建流
        Reader fr = new FileReader(new File("e:/java0212/readme.txt"));
        Writer fw = new FileWriter(new File("e:/java0212/readme2.txt"));
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String str = br.readLine();
        while(str!=null){ //读到了文件末尾 str == null
            //写一行
            bw.write(str);
            //bw.write("\r\n"); //不具有平台移植性 不同平台的换行符不同 \r \n \r\n
            bw.newLine();
            //输出
            System.out.println(str);
            //再读一行
            str = br.readLine();
        }
        //复制


        //关闭流
        br.close();
        bw.close();
        fr.close();
        fw.close();


    }
}
