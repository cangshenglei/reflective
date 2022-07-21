package TheNineteenth.other;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestScanner {
    //从键盘输入一行行数据，然后再一行行的写入到另外的一个文件中
    @Test
    public void test01() throws IOException {
        Scanner input = new Scanner(System.in);
        PrintStream ps = new PrintStream("1.txt");
        while(true){
            System.out.print("请输入一个单词：");
            String str = input.nextLine();
            if("stop".equals(str)){
                break;
            }
            ps.println(str);//写完换行
        }
        input.close();
        ps.close();
    }
    @Test
    public void test02() throws IOException {

        Scanner input = new Scanner(System.in);
        PrintStream ps = new PrintStream("1.txt");
        while(true){
            System.out.print("请输入一个单词：");
            String str = input.nextLine();
            if("stop".equals(str)){
                break;
            }
            ps.println(str);//写完换行
        }
        input.close();
        ps.close();
    }

    @Test
    public void test03() throws IOException {
        //Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(new FileInputStream("1.txt"));
        PrintStream ps = new PrintStream("2.txt");

        while(input.hasNextLine()){
            String str = input.nextLine();
            ps.println(str);//写完换行
        }
        input.close();
        ps.close();
    }
}
