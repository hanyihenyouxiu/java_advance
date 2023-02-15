package com.hanyi._04UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * 目标：UDP通信的使用介绍
 *
 * UDP协议的特点：
 *      * 面向无连接的协议
 *      * 发送端只管发送，不确认对方是否能收到。
 *      * 基于数据包进行数据传输
 *      * 发送数据包的大小限制64KB以内。
 *      * 因为面向无连接，速度快，但是不可靠，会丢失数据！
 *
 * UDP协议的使用场景
 *      * 在线视频
 *      *网络语音电话
 *
 * UDP协议相关的两个类
 *      * DatagramPacket
 *          * 数据包对象
 *          * 作用：用来封装要发送成要接收的数据。
 *      * DatagramSocket
 *          * 发送对象
 *          * 用与发送或者接受数据包。
 *
 * DatagramPacket类构造器
 *      发送端用：
 *          DatagramPacket(byte[] buf, int length, InetAddress address, int port)
 *          创建发送端数据包对象
 *          * buf：要发送的内容，字节数组。
 *          * length：要发送内容的长度，单位是字节
 *          * address：接收端的ip地址对象
 *          * port：接收端的端口号
 *      接收端用：
 *          DatagramPocket(byte[] buf, int length)
 *          * 创建接收端的数据包对象
 *          * buf:用来存储接收到的内容
 *          * length：能够接收内容的长度
 *
 * DatagramPacket类常用方法：
 *      * int getLength() 获得实际接收到的字节个数
 *
 * DatagramSocket类构造方法：
 *      * DatagramPacket()：创建发送端的Socket对象，系统会默认分配一个端口号。
 *      * DatagramPacket(int port)：创建接收端的Socket对象并指定端口号。
 *
 * DatagramSocket类成员方法：
 *      * void send(DatagramPacket dp)发送数据包
 *      * void receive(DatagramPacket p)接收数据包
 */
public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception {
        byte[] buffer = "寒毅很优秀".getBytes(StandardCharsets.UTF_8);
        // 创建数据
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 6666);

        // 发送数据的类,，可以申明客户端端口，默认分配
        DatagramSocket socket = new DatagramSocket();

        // 发送数据
        socket.send(packet);

        socket.close();
    }
}
