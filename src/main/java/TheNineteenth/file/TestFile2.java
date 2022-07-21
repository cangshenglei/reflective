package TheNineteenth.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 功能2：如何创建File对象
 *
 * 1.路径的分隔符
 *  正斜杠  e:/java0212/readme.txt 推荐使用
 *  反斜杠  e:\\java0212\\readme.txt
 * 2.路径的类型
 *  绝对路径： e:/java0212/readme.txt 从盘符开始
 *  相对路径： readme.txt 相对于C:\Users\Administrator\IdeaProjects\javase0212
 *            ../../readme.txt
 * 3. File指向一个目录
 *     File file = new File("e:/java0212");
 *
 * 4.File类不同的构造方法
 *     File file = new File("e:/java0212/readme.txt"); //路径文件名
 *      File file = new File("e:/java0212","readme.txt");
 *      File file = new File(new File("e:/java0212"),"readme.txt");
 */
public class TestFile2 {
    public static void main(String[] args) throws IOException {
        //1.使用File指向一个文件
        //File file = new File("e:/java0212/readme.txt");
        //File file = new File("e:\\java0212\\readme.txt");
        File file = new File("readme.txt");
        //File file = new File("../../readme.txt");
        //File file = new File("e:/java0212");
        //File file = new File("e:/java0212","readme.txt");
        //File dir = new File("e:/java0212");
        //File file = new File(dir,"readme.txt");
        //File file = new File(new File("e:/java0212"),"readme.txt");
        //2.获取该文件的各种属性
        System.out.println(file.getName()); //文件名readme.txt
        System.out.println(file.getAbsolutePath());//绝对路径 e:\java0212\readme.txt
        System.out.println(file.getCanonicalPath());//规范路径  E:\java0212\readme.txt
        System.out.println(file.length());//文件大小 16  123atguigu尚硅谷 3+7+3*2  GBK ANSI 不是UTF-8
        System.out.println(file.isFile()); //是文件吗？  true
        System.out.println(file.isDirectory());//是文件夹吗，是目录吗 false

    }
}
