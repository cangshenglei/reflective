package TheTwentieth.udp.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws IOException {
        //创建一个DatagramSocket，用来发送和接收数据
        DatagramSocket socket = new DatagramSocket(8888); //Receiver接收数据的端口
        //使用DatagramSocket接收数据，数据被存到DatagramPacket
        byte [] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length); //准备一个空的dp
        //接收前
        System.out.println(new String(dp.getData()));
        socket.receive(dp);//将收到的数据放入到dp中
        //接收后
        System.out.println(new String(dp.getData()));
        System.out.println(dp.getLength());//12
        System.out.println(dp.getPort());//9999
        System.out.println(dp.getAddress());//对方的IP
        System.out.println(dp.getData().length);//1024
        System.out.println(new String(dp.getData(),0,dp.getLength()));

        //关闭DatagramSocket
        socket.close();
    }
}
