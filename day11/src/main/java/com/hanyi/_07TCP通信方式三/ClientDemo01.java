package com.hanyi._07TCP通信方式三;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 目标：TCP可靠传输通信入门案例
 *
 * TCP/IP = Transfer Control Protocol ==> 传输控制协议
 * TCP协议的特点
 *  面向连接的协议
 *  只能由客户端主动发送数据给服务器端，服务器端收到数据以后，可以给客户端响应数据。
 *  通过三次挥手建立连接，连接成功形成数据传输通道。
 *  基于四次挥手断开连接
 *  基于IO流进行数据传输
 *  传输数据大小没有限制
 *  因为面向连接的协议，速度慢，但是是可靠的协议。
 *
 * TCP协议的使用场景
 *  文件上传和下载
 *  邮件发送和接收
 *  远程登录
 *
 *  TCP协议相关的类
 *      Socket
 *          一个该类的对象就代表一个客户端程序。
 *      ServerSocket
 *          一个该类的对象就代表一个服务器端程序。
 *  TCP通信也叫Socket网络编程，只要代码基于Socket开发，底层就是基于了可靠传输的
 *
 *  Socket类构造方法
 *      Socket(String host, int port)
 *      根据ip地址字符串和端口号创建客户端Socket对象。
 *      注意事项：只要执行该方法，就会立即连接指定的服务器程序，如果连接不成功，则会抛出异常。
 *  如果连接成功，则表示三次握手通过。
 *
 * Socket常用方法：
 *  OutputStream    getOutputStream()：获得字节数出流对象
 *  InputStream     getInputStream()：获得字节输入流对象
 *
 *  小结：
 *      1.客户端用Socket连接服务端
 *      2.服务端用ServerSocket注册端口，接受客户端的Socket连接。
 *      3.通信是很严格的，对方怎么发，你就应该怎么收，对方发多少你就只能收多少
 *      4.实现的面向连接的Socket的通信管道，一方如果出现对象，另一方会出现异常。
 */
public class ClientDemo01 {
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
