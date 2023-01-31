package com.hanyi._03InetAddress;

import java.net.InetAddress;
import java.util.Arrays;

/**
 * 目标：InetAddress类概述
 *      一个该类的对象就代表一个IP地址对象。
 * InetAddress类成员方法：
 *      static InetAddress getLocalHost();
 *          * 获取本地主机IP地址对象
 *      static InetAddress getByName(String host)
 *          * 根据IP地址字符串或本机名获取对应的IP地址对象。
 *      String getHostName()
 *          * 获取主机名。
 *      String getHostAddress()
 *          * 获取IP地址字符串。
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());

        InetAddress ip1 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        InetAddress ip2 = InetAddress.getByName("39.156.66.14");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        System.out.println(ip2.isReachable(5000));
    }
}
