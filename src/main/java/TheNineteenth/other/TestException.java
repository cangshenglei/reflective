package TheNineteenth.other;

import org.junit.Test;

import java.io.*;

public class TestException {
    //之前的异常处理：try-catch-finally
    @Test
    public void test01(){
        InputStream fis = null;
        OutputStream fos = null;
        BufferedInputStream bis = null; //8192
        BufferedOutputStream bos = null; //8192
        try {
            //创建输入流和输出流
            fis = new FileInputStream("e:/VMware-workstation-full-16.1.0-17198959.exe");
            fos = new FileOutputStream(new File("e:/VMware-workstation-full-16.1.0-17198959b.exe"));
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //使用输入流和输出流完成复制(字节数组)
            byte [] bytes = new byte[1024];

            int len;
            while((len = bis.read(bytes))!=-1){
                //写
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭输入流和输出流
            try {
                if(bis!=null){
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

//            fis.close();
//            fos.close();
        }



    }
    //新的异常处理：try-resources 省略finally中的close，自动关闭
    //不管执行是否有异常，()中的资源都会自动关闭
    //要求资源必须实现一个接口：public interface Closeable extends AutoCloseable
    @Test
    public void test02(){
        //创建输入流和输出流
        try (
               InputStream fis = new FileInputStream("e:/VMware-workstation-full-16.1.0-17198959.exe");
                OutputStream fos = new FileOutputStream(new File("e:/VMware-workstation-full-16.1.0-17198959b.exe"));
                BufferedInputStream bis = new BufferedInputStream(fis); //8192
                BufferedOutputStream bos = new BufferedOutputStream(fos); //8192
                ){
            //使用输入流和输出流完成复制(字节数组)
            byte [] bytes = new byte[1024];

            int len;
            while((len = bis.read(bytes))!=-1){
                //写
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
