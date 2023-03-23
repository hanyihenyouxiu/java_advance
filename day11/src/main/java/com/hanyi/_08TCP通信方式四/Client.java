package com.hanyi._08TCP通信方式四;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 拓展：
 *
 * 引入：
 *  我们之前引入的线程解决一个服务端可以接受多个客户端消息
 *  客户顿和服务端的线程模型是：N-N的关系。一个客户端要一个线程。
 *  这种模型是不行的，并发越高系统越容易崩溃
 *
 * 解决：
 *  我们可以再服务端引入线程池，使用线程池来解决与客户端的消息通信
 *  线程池不会引起过多的线程而导致系统死机！
 *
 * 这种方案的优劣势：
 *  优势：不会引起系统的死机，可以控制并发线程的数量。
 *  劣势：同时可以并发的线程将受到限制。
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream os = socket.getOutputStream();

        PrintStream ps = new PrintStream(os);

        while (true) {
            Scanner s = new Scanner(System.in);
            ps.println(s.nextLine());
            //ps.flush();
        }
    }
}

