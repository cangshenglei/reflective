package TheTwentieth.tcp.demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能：多个客户端和一个服务器通信，客户端发成语，服务器反转并返回。直到客户端输入3q3q结束通信
 *
 * 迭代1：一次单向通信：客户端发一个成语给服务器端，服务器收到并输出。
 * 迭代2：一次双向通信：客户端发一个成语给服务器端，服务器收到并输出。
 *       服务器将成语反转，返回给客户端；客户端收到并输出
 *       缺点1：使用的OutputStream和InputStream，只能操作byte，操作繁琐
 *       方案1：DataInputStream和DataOutputStream  如果是基本数据类型和字符串，建议该方式
 *       方案2：ObjectInputStrema和ObjectOutputStream 如果是对象，只能有该方式
 *       方案3：BufferedReader（readLine()）和PrintStream(println()) 如果都是String，该方案可以
 *       缺点2：成语不是从键盘输入，而是给定
 * 迭代3： 使用处理流简化操作并从键盘输入成语
 * 迭代4： 一个客户端和一个服务器端可以一直通信下去，直到客户端输入了3q3q

 *
 *
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建一个ServerSocket，指定监听的端口
        ServerSocket serverSocket = new ServerSocket(8888);
        //使用ServerSocket进行监听
        Socket socket = serverSocket.accept(); //请求没有来，在此阻塞；请求来了，返回Socket
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());
        while(true){
            //输出客户端请求信息
            String info = br.readLine();
            if("3q3q".equals(info)){
                break;
            }
            System.out.println("客户端发来的成语是："+info);
            //给出客户端响应
            String result = new StringBuilder(info).reverse().toString();
            ps.println(result);
        }
        //关闭资源
        socket.close(); //关闭了socket，自然也就关闭了is和os。
        serverSocket.close();

    }
}
