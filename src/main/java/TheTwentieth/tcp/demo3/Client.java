package TheTwentieth.tcp.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建一个Socket，指定服务器的IP和监听端口
        //Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        Socket socket = new Socket(InetAddress.getByName("192.168.1.101"),8888);

        //发送一个请求
        PrintStream ps = new PrintStream(socket.getOutputStream());
        //BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个成语:");
        //String word = br2.readLine();
        String word = input.nextLine();
        ps.println(word);

        //接收来自服务器端的响应
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = br.readLine();
        System.out.println("服务端发来的成语反转是："+result);

        //关闭资源
        //is.close();
        //ps.close();
        input.close();
        socket.close();
    }
}
