package com.hanyi._19线程同步_同步方法;

/**
 * 目标：线程同步_同步方法
 *
 * b.同步方法：
 *  作用：把出现线程安全问题的核心方法给锁起来，
 *      每次只能一个线程进入访问，其他线程必须在方法外面等待。
 *  用法：直接给方法加上一个修饰符synchronized。
 *  原理：同步方法的原理和同步代码块的底层原理其实是完全一样的，只是
 *      同步方法其实底层也是有锁对象的。
 *          如果是实例方法，同步方法默认用this作为的锁对象。
 *          如果是静态方法，同步方法默认用类名.class作为的锁对象。
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
