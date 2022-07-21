package TheTwentieth.tcp.demo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        //创建一个Socket，指定服务器的IP和监听端口
        //Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        Socket socket = new Socket(InetAddress.getByName("192.168.1.101"),8888);
        Scanner input = new Scanner(System.in);
        PrintStream ps = new PrintStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while(true){
            //发送一个请求
            System.out.println("请输入一个成语:");
            String word = input.nextLine();
            ps.println(word);
            //退出条件
            if("3q3q".equals(word)){
                break;
            }
            //接收来自服务器端的响应
            String result = br.readLine();
            System.out.println("服务端发来的成语反转是："+result);
        }
        //关闭资源
        input.close();
        socket.close();
    }
}
