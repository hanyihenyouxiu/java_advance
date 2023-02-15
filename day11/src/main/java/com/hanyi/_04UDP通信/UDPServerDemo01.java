package com.hanyi._04UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2023/1/20
 * Time: 9:20
 * Description:
 *
 * @author 寒毅
 */
public class UDPServerDemo01 {
    public static void main(String[] args) throws Exception{
        byte[] buff = new byte[10 * 1024];
        // 1.创建一个接收客户端的数据包对象
        DatagramPacket packet = new DatagramPacket(buff, buff.length);

        DatagramSocket socket = new DatagramSocket(6666);

        socket.receive(packet);

        String s = new String(buff, 0, packet.getLength());

        System.out.println(s);

        socket.close();

    }
}
