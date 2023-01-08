package com.itheima._11多线程;

/**
 * 目标：多线程的概述。（并发编程，Java Util Concurrent）
 *
 * 什么是进程？
 *      程序是静止的，运行中的程序就是进程。
 *      进程的三个特征：
 *      1.动态性：进程是运行中的程序，要动态的占用内存，CPU和网络等资源。
 *      2.独立性：进程和进程之间是相互独立的，彼此有自己的独立内存区域。
 *      3.并发性：假如CPU是单核，同是一个是可其实内存中只有一个进程再被执行。
 *          CPU会分时轮询切换依次为每个进程服务，因为切换的速度非常快，
 *          给我们的感觉这些进程在同时执行，这就是并发性。
 *
 *      并行：同一时刻有多个任务在执行。
 *
 * 什么是线程？
 *      线程属于进程的。一个进程可以包含多个线程，这就是多线程。
 *      线程创建开销相对于进程来说比较小。
 *      线程也支持并发性。
 *
 * 线程的作用：
 *      可以提高程序的效率，线程也支持并发性，可以有更多机会得到CPU。
 *      多线程可以解决很多业务模型。
 *      大型高并发技术的核心技术。
 *      涉及到多线程的开发可能都比较难理解。
 */
public class ThreadDemo {
}
