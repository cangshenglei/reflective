package TheNineteenth.file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Date;

/**

 * 功能6：模拟实现dir /s *.jar命令，显示当前文件夹下的子文件夹和文件的信息(包含各级子文件夹下的内容),进行筛选
 *         File + 递归
 */
public class TestFile6 {
    public static void main(String[] args) throws IOException {
        //1.使用File指向一个文件夹
        File dir = new File("e:/install");

        //2.获取该文件夹下的子文件和文件的信息（包括下级子文件夹的内容）
        showInfo(dir,0);

    }

    public static void showInfo(File dir,int level){
        //显示所有内容，不筛选
        //File[] files = dir.listFiles();//使用File指向每个文件和子文件夹

        //显示筛选后内容：*.jar
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //如果是jar文件 或者是文件夹 返回true
                return pathname.getName().endsWith(".jar") || pathname.isDirectory();
            }
        };
        File [] files = dir.listFiles(fileFilter);
        for (File file :files){
            //1.显示该文件或者文件夹的信息
            //空格缩进
            for (int i = 0; i <level ; i++) {
                System.out.print(" ");
            }
            //最近的修改时间
            System.out.print(new Date(file.lastModified()).toLocaleString()+"\t");
            //类型
            System.out.print(file.isDirectory()?"<DIR>":"  "+"\t");
            //大小
            System.out.print(file.length()+"\t");
            //名称
            System.out.println(file.getName());

            //2.如果是子文件夹，就递归
            if(file.isDirectory()){
                showInfo(file,level+1);
            }
        }
    }
}
