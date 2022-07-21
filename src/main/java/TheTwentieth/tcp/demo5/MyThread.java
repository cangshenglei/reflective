package TheTwentieth.tcp.demo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyThread extends  Thread  {
    private Socket socket;

    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
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
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            //关闭资源
            try {
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
