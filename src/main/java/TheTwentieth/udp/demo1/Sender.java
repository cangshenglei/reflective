package TheTwentieth.udp.demo1;

import java.io.IOException;
import java.net.*;

/**
 * 功能：在线客户，一次单向通信
 */
public class Sender {
    public static void main(String[] args) throws IOException {
        //创建一个DatagramSockket，用来发送和接收数据
        //DatagramSocket socket = new DatagramSocket(); //可以不写参数，自动分配一个Sender接收数据的端口
        DatagramSocket socket = new DatagramSocket(9999);

        //使用DatagramSocket发送数据，数据被封装为DatagramPacket
        byte[] bytes = "亲，在吗".getBytes();
        InetAddress address = InetAddress.getLocalHost();
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        socket.send(dp);

        //关闭DatagramSocket
        socket.close();
    }
}
