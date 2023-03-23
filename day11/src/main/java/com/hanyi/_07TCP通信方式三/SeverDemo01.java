package com.hanyi._07TCP通信方式三;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2023/2/15
 * Time: 17:33
 * Description:
 *
 * @author 寒毅
 */
public class SeverDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动了！");
        ServerSocket ss = new ServerSocket(8888);

        while (true) {
            Socket socket = ss.accept();
            new Server(socket).start();
        }

    }
}

class Server extends Thread{

    Socket socket;

    public Server(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            Reader fr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(fr);
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
            System.out.println("有人下线了");
        }
    }
}



