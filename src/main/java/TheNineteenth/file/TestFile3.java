package TheNineteenth.file;

import java.io.File;
import java.io.IOException;

/**
 * 功能3：创建文件
 *     file.createNewFile();
 *   创建目录
 *     dir.mkdirs(); //创建一级或者多级文件夹 推荐使用
 *     dir.mkdir();//创建一级文件夹  mkdir  make directory
 *     删除文件 删除目录
 *      file.delete();
 */
public class TestFile3 {
    public static void main(String[] args) {
        //1.使用File指向一个文件
        File file = new File("e:/atguigu/java0212/readme.txt");
        //2.如果文件存在，就删除，如果不存在就创建
        boolean flag = file.exists();//文件是否存在 true 存在
        if(flag){
            //存在删除
            file.delete();//自己删除自己
            System.out.println("---delete----");
        }else{
            //先判断上级目录是否存在，不存在就创建
            File dir = file.getParentFile(); //文件所在的文件夹
            if(!dir.exists()){
                dir.mkdirs(); //创建一级或者多级文件夹 推荐使用
                //dir.mkdir();//创建一级文件夹  mkdir  make directory
                System.out.println("-----mkdir/mkdirs----");
            }
            //不存在就创建
            try {
                file.createNewFile();
                System.out.println("-----createNewFile-----");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
