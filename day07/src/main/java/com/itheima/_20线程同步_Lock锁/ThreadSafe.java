package com.itheima._20线程同步_Lock锁;

/**
 * 目标：线程同步_Lock显式锁。
 *
 * c.Lock显式锁。
 *      java.util.concurrent.locks.Lock机制提供了比synchronized代码块和synchronized同步方法
 *      同步代码块/同步方法具有的功能Lock都有，除此之外还更加强大。
 *
 *      Lock锁也称同步锁，加锁和释放锁方法化了，如下：
 *          -- public void lock()：加锁
 *          -- public void unlock()：释放锁
 * 小结：
 *  线程安全性能差
 *  线程不安全性能好，假如开发中不会存在多线程安全问题，建议使用线程不安全的设计。
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
