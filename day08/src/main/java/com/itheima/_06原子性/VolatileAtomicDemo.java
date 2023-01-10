package com.itheima._06原子性;

/**
 * 目标：Volatile修饰变量的原子性研究。
 *
 * 什么是原子性？
 *      原子性，是指一些操作是一个整体，要么全部操作失败，要么全部失败。
 * volatile 只能保证线程间的可见性，不能保证变量操作的原子性。
 */
public class VolatileAtomicDemo {

    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        for (int i = 0; i < 100; i++) {
            new Thread(m).start();
        }
    }

}

class MyRunnable implements Runnable{
    private volatile int count;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println(count);
        }
    }
}
