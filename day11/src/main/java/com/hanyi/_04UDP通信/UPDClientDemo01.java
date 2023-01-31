package com.hanyi._04UDP通信;

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
 *
 */
public class UPDClientDemo01 {
}
