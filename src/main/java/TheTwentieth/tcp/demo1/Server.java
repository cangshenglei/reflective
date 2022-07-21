package TheTwentieth.tcp.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能：多个客户端和一个服务器通信，客户端发成语，服务器反转并返回。直到客户端输入3q3q结束通信
 *
 * 迭代1：一次单向通信：客户端发一个成语给服务器端，服务器收到并输出。
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建一个ServerSocket，指定监听的端口
        ServerSocket serverSocket = new ServerSocket(8888);
        //使用ServerSocket进行监听
        Socket socket = serverSocket.accept(); //请求没有来，在此阻塞；请求来了，返回Socket
        //输出客户端请求信息
        InputStream is = socket.getInputStream();
        byte [] bytes = new byte[1024];
        int len = is.read(bytes);
        String info = new String(bytes, 0, len);
        System.out.println("客户端发来的成语是："+info);

        //关闭资源
        is.close();
        socket.close();
        serverSocket.close();

    }
}
