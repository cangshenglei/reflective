package TheNineteenth.converter;


import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 1.转换流是字节流还是字符流
 *   字符流！！1
 *   public class OutputStreamWriter extends Writer
 *   public class FileReader extends InputStreamReader
 * 2.   只可以将字节流转换为字符流
 *     OutputStream---->OutputStreamWriter---------->Writer
 *     InputStream ----->InputStreamReader----->Reader
 *
 *     没有WriterOutputStream   ReaderInputStream类，没有这种应用场景
 */
public class TestOutputStreamWriter {
    @Test
    public void test01() throws Exception {
        // 定义文件路径
        String FileName = "E:\\out.txt";
        // 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName));
        // 写出数据
        osw.write("你好"); // 保存为6个字节
        osw.close();
    }

    @Test
    public void test02() throws Exception {
        // 定义文件路径
        String FileName = "E:\\out.txt";
        // 创建流对象,默认UTF8编码
        Writer osw = new OutputStreamWriter(new FileOutputStream(FileName),"GBK");
        // 写出数据
        osw.write("你好"); // 保存为4个字节
        osw.close();
    }
}