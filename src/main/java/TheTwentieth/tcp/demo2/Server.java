package TheTwentieth.tcp.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能：多个客户端和一个服务器通信，客户端发成语，服务器反转并返回。直到客户端输入3q3q结束通信
 *
 * 迭代1：一次单向通信：客户端发一个成语给服务器端，服务器收到并输出。
 * 迭代2：一次双向通信：客户端发一个成语给服务器端，服务器收到并输出。
 *       服务器将成语反转，返回给客户端；客户端收到并输出
 *  总结：
 *  1.服务器端创建一个ServerSocket，客户端创建一个Socket *
 *  2. Socket socket = serverSocket.accept();//请求没有来，在此阻塞；请求来了，返回Socket
 *  3.真正TCP通信开始后，编程IO流的操作；
 *  4.明确InputStream和OutputStream的选择 向对方发数据(写)使用输出流；接收来自对方的数据（读）使用输入流
 *
 *
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

        //给出客户端响应
        String result = new StringBuilder(info).reverse().toString();
        OutputStream os = socket.getOutputStream();
        os.write(result.getBytes());

        //关闭资源
        //is.close();
        //os.close();
        socket.close(); //关闭了socket，自然也就关闭了is和os。
        serverSocket.close();

    }
}
