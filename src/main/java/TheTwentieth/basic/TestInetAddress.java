package TheTwentieth.basic;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    @Test
    public void test01() throws UnknownHostException {
        //获取本机的IP地址
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.toString());
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
    }

    @Test
    public void test02() throws UnknownHostException {
        //获取尚硅谷服务器的IP地址
        InetAddress ip = InetAddress.getByName("www.atguigu.com");
        System.out.println(ip);

//        ip = InetAddress.getByName("www.atguigu123.com");
//        System.out.println(ip);
    }

    @Test
    public void test03() throws UnknownHostException {
        //		byte[] addr = {112,54,108,98};
        byte[] addr = {(byte)192,(byte)168,24,56};
        InetAddress atguigu = InetAddress.getByAddress(addr);
        System.out.println(atguigu);
    }

}
