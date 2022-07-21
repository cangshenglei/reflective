package TheNineteenth.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * File用来指向一个文件（文件夹/目录也是文件）
 * 可以获取该文件的各种属性：文件名、路径、大小、可读可写.....
 * 创建新文件，删除文件，查看当前文件夹下的内容
 *
 * 切记：File不能读写文件的内容 需要借助IO流来实现
 * package java.io
 *
 * 功能1：可以获取该文件的各种属性：文件名、路径、大小、可读可写.....
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        //1.使用File指向一个文件
        File file = new File("e:/java0212/readme.txt");

        //2.获取该文件的各种属性
        System.out.println(file.getName()); //文件名readme.txt
        System.out.println(file.getAbsolutePath());//绝对路径 e:\java0212\readme.txt
        System.out.println(file.getCanonicalPath());//规范路径  E:\java0212\readme.txt
        System.out.println(file.length());//文件大小 16  123atguigu尚硅谷 3+7+3*2  GBK ANSI 不是UTF-8
        System.out.println(file.isFile()); //是文件吗？  true
        System.out.println(file.isDirectory());//是文件夹吗，是目录吗 false
        System.out.println(file.canRead()); //可读吗
        System.out.println(file.canWrite());//可写吗
        System.out.println(file.canExecute());//可执行
        System.out.println(file.lastModified());
        System.out.println(new Date(file.lastModified()));//最近的修改时间
    }
}
