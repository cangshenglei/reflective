package TheNineteenth.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**

 * 功能4：模拟实现dir命令，显示当前文件夹下的子文件夹和文件的信息
 */
public class TestFile4 {
    public static void main(String[] args) throws IOException {
        //1.使用File指向一个文件夹
        File dir = new File("e:/install");

        //2.获取该文件夹下的子文件和文件的信息（不包括下级子文件夹的内容）
        //String[] list = dir.list(); //只有名字
        File[] files = dir.listFiles();//使用File指向每个文件和子文件夹
        for (File file :files){
            //System.out.println(file.toString());
            //最近的修改时间
            System.out.print(new Date(file.lastModified()).toLocaleString()+"\t");
            //类型
            System.out.print(file.isDirectory()?"<DIR>":"  "+"\t");
            //大小
            System.out.print(file.length()+"\t");
            //名称
            System.out.println(file.getName());
        }

    }
}
