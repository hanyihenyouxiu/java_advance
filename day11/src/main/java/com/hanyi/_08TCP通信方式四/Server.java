package com.hanyi._08TCP通信方式四;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/2/15
 * Time: 22:11
 * Description:
 *
 * @author 寒毅
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动了！");
        ServerSocket ss = new ServerSocket(8888);
        HandlerSocketThreadPool th = new HandlerSocketThreadPool(3, 100);

        while (true) {
            Socket socket = ss.accept();
            th.execute(new ReadClientRunnable(socket));
        }

    }
}
