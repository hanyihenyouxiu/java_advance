package com.itheima._18线程同步_同步代码块;

/**
 * 目标：线程同步_同步代码块
 *
 * 线程同步的作用：就是为了解决线程安全问题的方案。
 *
 * 线程同步解决线程安全问题的核心思想“
 *      让多个线程实现先后一次访问共享资源，这样就解决了安全问题。
 *
 * 线程同步的做法：
 *      是把共享资源进行上锁，每次只能一个线程进入访问完毕以后，其他线程才能进来。
 *
 * 线程同步的三种方式：
 *  1.同步代码块、
 *  2.同步方法
 *  3.使用显示锁
 *
 * 格式：
 *      synchronized(锁对象) {
 *          // 访问共享资源的核心代码
 *      }
 *
 *      锁对象：理论上可以是任意的"唯一"对象即可。
 *      原则上：锁对象建议使用共享资源。
 *          -- 在实例方法中建议使用this所谓锁对象。此时this正好是共享资源。
 *          -- 在静态方法中建议使用类名.class字节码作为锁对象。
 */
public class ThreadSafe {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setMoney(10000d);
        Thread xiaoming = new DrawThread( "小明", account1);
        Thread xiaohong = new DrawThread("小红", account1);
        xiaohong.start();
        xiaoming.start();
    }
}
