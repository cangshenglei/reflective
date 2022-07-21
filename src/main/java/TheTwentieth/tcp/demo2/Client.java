package TheTwentieth.tcp.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建一个Socket，指定服务器的IP和监听端口
        //Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        Socket socket = new Socket(InetAddress.getByName("192.168.1.101"),8888);

        //发送一个请求
        OutputStream os = socket.getOutputStream();
        os.write("百战百胜".getBytes());

        //接收来自服务器端的响应
        InputStream is = socket.getInputStream();
        byte [] bytes = new byte[1024];
        int len = is.read(bytes);
        String result = new String(bytes, 0, len);
        System.out.println("服务端发来的成语反转是："+result);

        //关闭资源
        is.close();
        os.close();
        socket.close();
    }
}
